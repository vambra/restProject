package lt.viko.eif.bstonkute.rest.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {

    private Component component;

    @BeforeEach
    void setUp() {
        component = new Component();
    }

    @Test
    void getName() {
        component.setName("testName");
        assertNotNull(component);
        assertEquals("testName", component.getName());
    }

    @Test
    void setName() {
        component.setName("testName");
        assertNotNull(component);
    }

    @Test
    void getCost() {
        component.setCost(10f);
        assertNotNull(component);
        assertEquals(10f, component.getCost());
    }

    @Test
    void setCost() {
        component.setCost(10f);
        assertNotNull(component);
        assertEquals(10f, component.getCost());
    }

    @Test
    void getTaskList() {
        List<Task> taskList = new ArrayList<>();
        Task task = new Task("taskName", 10, 2, 30);
        taskList.add(task);
        component.setTaskList(taskList);
        assertNotNull(component.getTaskList());
        assertEquals(taskList, component.getTaskList());
    }

    @Test
    void setTaskList() {
        List<Task> taskList = new ArrayList<>();
        Task task = new Task("taskName", 10, 2, 30);
        taskList.add(task);
        component.setTaskList(taskList);
        assertNotNull(component.getTaskList());
        assertEquals(taskList, component.getTaskList());
    }
}