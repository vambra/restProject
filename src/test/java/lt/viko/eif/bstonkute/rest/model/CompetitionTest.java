package lt.viko.eif.bstonkute.rest.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompetitionTest {

    private Competition competition;

    @BeforeEach
    void setUp() {
        competition = new Competition();
    }

    @Test
    void getCategory() {
        competition.setCategory("testCategory");
        assertNotNull(competition);
        assertEquals("testCategory", competition.getCategory());
    }

    @Test
    void setCategory() {
        competition.setCategory("testCategory");
        assertNotNull(competition);
        assertEquals("testCategory", competition.getCategory());
    }

    @Test
    void getAward() {
        competition.setAward("testAward");
        assertNotNull(competition);
        assertEquals("testAward", competition.getAward());
    }

    @Test
    void setAward() {
        competition.setAward("testAward");
        assertNotNull(competition);
        assertEquals("testAward", competition.getAward());
    }

    @Test
    void getPrize() {
        competition.setPrize("testPrize");
        assertNotNull(competition);
        assertEquals("testPrize", competition.getPrize());
    }

    @Test
    void setPrize() {
        competition.setPrize("testPrize");
        assertNotNull(competition);
        assertEquals("testPrize", competition.getPrize());
    }
}