package lt.viko.eif.bstonkute.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Class for storing information about a component - name, cost and a list of tasks (see class {@link Task}).
 *
 * @author Brigita Stonkutė
 */
@XmlType(propOrder = {"name", "cost", "taskList"})
public class Component {
    private String name;
    private Float cost;
    private List<Task> taskList;

    /**
     * Class constructor that takes no parameters.
     */
    public Component() {
        // empty constructor for error prevention
    }

    /**
     * Class constructor that takes all the class fields as parameters.
     *
     * @param name     name of the component
     * @param cost     cost of the component
     * @param taskList list of tasks (see object class {@link Task})
     */
    public Component(String name, Float cost, List<Task> taskList) {
        this.name = name;
        this.cost = cost;
        this.taskList = taskList;
    }

    /**
     * Gets the name of the component.
     *
     * @return name of the component
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the component.
     *
     * @param name name of the component
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the cost of (money spent towards) the component.
     *
     * @return cost of the component
     */
    public Float getCost() {
        return cost;
    }

    /**
     * Sets the cost of (money spent towards) the component.
     *
     * @param cost cost of the component
     */
    public void setCost(Float cost) {
        this.cost = cost;
    }

    /**
     * Gets the list of tasks (see class {@link Task}).
     *
     * @return list of tasks
     */
    @XmlElementWrapper(name = "taskList")
    @XmlElement(name = "task")
    public List<Task> getTaskList() {
        return taskList;
    }

    /**
     * Sets the list of tasks (see class {@link Task}).
     *
     * @param taskList list of tasks
     */
    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}