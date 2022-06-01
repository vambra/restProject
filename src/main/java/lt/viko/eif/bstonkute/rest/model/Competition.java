package lt.viko.eif.bstonkute.rest.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Class for storing information about a competition - category, award and prize.
 *
 * @author Brigita Stonkutė
 */
@XmlType(propOrder = {"category", "award", "prize"})
public class Competition {
    private String category;
    private String award;
    private String prize;

    /**
     * Class constructor that takes no parameters.
     */
    public Competition() {
        // empty constructor for error prevention
    }

    /**
     * Class constructor that takes all the class fields as parameters.
     *
     * @param category category of the competition
     * @param award    place or award received at the competition
     * @param prize    prize awarded at the competition
     */
    public Competition(String category, String award, String prize) {
        this.category = category;
        this.award = award;
        this.prize = prize;
    }

    /**
     * Gets the category of the competition.
     *
     * @return category of the competition
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the competition.
     *
     * @param category category of the competition
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets the place or award received at the competition.
     *
     * @return place or award received at the competition
     */
    public String getAward() {
        return award;
    }

    /**
     * Sets the place or award received at the competition.
     *
     * @param award place or award received at the competition
     */
    public void setAward(String award) {
        this.award = award;
    }

    /**
     * Gets the prize awarded at the competition.
     *
     * @return prize awarded at the competition
     */
    public String getPrize() {
        return prize;
    }

    /**
     * Sets the prize awarded at the competition.
     *
     * @param prize prize awarded at the competition
     */
    public void setPrize(String prize) {
        this.prize = prize;
    }
}