package Integration;

import java.util.List;

import com.google.gson.Gson;
import com.lob.api.ApiException;
import com.lob.api.Configuration;
import com.lob.api.client.LettersApi;

import com.lob.model.AddressEditable;
import com.lob.model.Letter;
import com.lob.model.LetterDeletion;
import com.lob.model.LetterEditable;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.TestFixtures;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.File;

public class LettersApiSpecTest {
    private LettersApi validApi;
    private LettersApi invalidApi;
    private TestFixtures testFixtures = new TestFixtures();
    @BeforeClass
    public void before_class()
    {
        validApi = new LettersApi(Configuration.getConfigForIntegration());
    }

    @DataProvider (name = "letter-create-data-provider")
    public Object[][] letterCreateDpMethod() {
        return new Object[][] {
            {"certified", LetterEditable.ExtraServiceEnum.CERTIFIED},
            {"registered", LetterEditable.ExtraServiceEnum.REGISTERED},
            {"none", LetterEditable.ExtraServiceEnum.NULL},
        };
    }

    @Test(
        enabled=true,
        groups={"Integration", "Create", "Letter", "Valid"}
        // dataProvider = "letter-create-data-provider"
    )
    public void letterCreateTest(
        // String prop, LetterEditable.ExtraServiceEnum val
    ) throws ApiException {
        LetterEditable letterEditable = new LetterEditable();

        List<AddressEditable> addressEditableList = testFixtures.get_ADDRESSES_EDITABLE();

        Gson gson = new Gson();

        letterEditable.setTo(gson.toJson(addressEditableList.get(0)));
        letterEditable.setFrom(gson.toJson(addressEditableList.get(0)));
        letterEditable.setColor(true);
        letterEditable.setExtraService(LetterEditable.ExtraServiceEnum.CERTIFIED);
        // letterEditable.setFile(testFixtures.get_FILE_LOCATION_8X11());
        // Path path = Paths.get("/Users/jessica-ho/Downloads/us_letter_1pg.pdf");
        // if (Files.notExists(path)) {
        //     throw new IllegalArgumentException("File does not exist!");
        // }

        // byte[] bytes = Files.readAllBytes(path);
        // String s = new String(bytes, StandardCharsets.UTF_8);
        letterEditable.setFile(new File("/Users/jessica-ho/Downloads/us_letter_1pg.pdf"));


        Letter letter = validApi.create(letterEditable, null);

        Assert.assertNotNull(letter.getId());
        Assert.assertEquals(letter.getExtraService(), letter.getExtraService());

        // Letter retrievedLetter = validApi.get(letter.getId());
        // Assert.assertEquals(retrievedLetter.getId(), letter.getId());

        LetterDeletion cancelledLetter = validApi.cancel(letter.getId());
        Assert.assertTrue(cancelledLetter.getDeleted());
    }
}