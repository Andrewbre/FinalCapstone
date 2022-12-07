import com.techelevator.dao.BaseDaoTests;
import com.techelevator.dao.JdbcEventDao;
import com.techelevator.dao.JdbcGenreDao;
import com.techelevator.model.Genre;
import org.junit.Before;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcGenreDaoTests extends BaseDaoTests {
    private JdbcGenreDao sut;
    private Genre testGenre;

    @Before
    public void setup() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        sut = new JdbcGenreDao(jdbcTemplate);

    }
}
