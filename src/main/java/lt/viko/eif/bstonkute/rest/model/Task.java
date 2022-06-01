package lt.viko.eif.bstonkute.rest.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Class for storing information about a task - name, progress in percentage
 * and time (hours and minutes) spent on the task.
 *
 * @author Brigita Stonkutė
 */
@XmlType(propOrder = {"name", "progress", "timeElapsedHours", "timeElapsedMinutes"})
public class Task {
    private String name;
    private Integer progress;
    private Integer timeElapsedHours;
    private Integer timeElapsedMinutes;

    /**
     * Class constructor that takes no parameters.
     */
    public Task() {
        // empty constructor for error prevention
    }

    /**
     * Class constructor that takes all the class fields as parameters.
     *
     * @param name               name of the task
     * @param progress           progress of the task in percentages (0-100%)
     * @param timeElapsedHours   hours spent working in the task
     * @param timeElapsedMinutes leftover minutes spent working on the task (0-59)
     */
    public Task(String name, Integer progress, Integer timeElapsedHours, Integer timeElapsedMinutes) {
        this.name = name;
        this.progress = progress;
        this.timeElapsedHours = timeElapsedHours;
        this.timeElapsedMinutes = timeElapsedMinutes;
    }

    /**
     * Gets the name of the task.
     *
     * @return name of the task
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the task.
     *
     * @param name name of the task
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the progress of the task in percentages (0-100%).
     *
     * @return progress of the task in percentages
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * Sets the progress of the task in percentages (0-100%).
     *
     * @param progress progress of the task in percentages
     */
    public void setProgress(Integer progress) {
        if (progress >= 0 && progress <= 100)
            this.progress = progress;
    }

    /**
     * Gets the hours spent working on the task.
     *
     * @return hours spent working in the task
     */
    public Integer getTimeElapsedHours() {
        return timeElapsedHours;
    }

    /**
     * Sets the hours spent working on the task.
     *
     * @param timeElapsedHours hours spent working in the task
     */
    public void setTimeElapsedHours(Integer timeElapsedHours) {
        this.timeElapsedHours = timeElapsedHours;
    }

    /**
     * Gets the leftover minutes spent working on the task (0-59).
     *
     * @return leftover minutes spent working on the task
     */
    public Integer getTimeElapsedMinutes() {
        return timeElapsedMinutes;
    }

    /**
     * Sets the leftover minutes spent working on the task (0-59).
     *
     * @param timeElapsedMinutes leftover minutes spent working on the task
     */
    public void setTimeElapsedMinutes(Integer timeElapsedMinutes) {
        if (timeElapsedMinutes >= 0 && timeElapsedMinutes <= 59)
            this.timeElapsedMinutes = timeElapsedMinutes;
    }
}