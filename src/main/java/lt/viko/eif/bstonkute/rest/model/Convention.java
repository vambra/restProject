package lt.viko.eif.bstonkute.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Class for storing information about a Convention -
 * name, date and a list of competitions participated in at the convention (see class {@link Competition}).
 *
 * @author Brigita Stonkutė
 */
@XmlType(propOrder = {"name", "date", "competitionList"})
public class Convention {
    private String name;
    private String date;
    private List<Competition> competitionList;

    /**
     * Class constructor that takes no parameters.
     */
    public Convention() {
        // empty constructor for error prevention
    }

    /**
     * Class constructor that takes all the class fields as parameters.
     *
     * @param name            name of the convention
     * @param date            date of the convention
     * @param competitionList list of competitions participated in at the convention
     */
    public Convention(String name, String date, List<Competition> competitionList) {
        this.name = name;
        this.date = date;
        this.competitionList = competitionList;
    }

    /**
     * Gets the name of the convention.
     *
     * @return name of the convention
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the convention.
     *
     * @param name name of the convention
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the date of the convention.
     *
     * @return date of the convention
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date of the convention.
     *
     * @param date date of the convention
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the list of competitions participated in at the convention (see class {@link Competition}).
     *
     * @return list of competitions
     */
    @XmlElementWrapper(name = "competitionList")
    @XmlElement(name = "competition")
    public List<Competition> getCompetitionList() {
        return competitionList;
    }

    /**
     * Sets the list of competitions participated in at the convention (see class {@link Competition}).
     *
     * @param competitionList list of competitions
     */
    public void setCompetitionList(List<Competition> competitionList) {
        this.competitionList = competitionList;
    }
}
