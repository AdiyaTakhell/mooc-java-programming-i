
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseManagementTest {

    @Test
    public void exerciseListIsInitiallyEmpty() {
        ExerciseManagement manager = new ExerciseManagement();

        assertEquals(0, manager.exerciseList().size());
    }

    @Test
    public void addingExercisesGrowsTheList() {
        ExerciseManagement manager = new ExerciseManagement();

        manager.add("Write a test");

        assertEquals(1, manager.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInTheList() {
        ExerciseManagement manager = new ExerciseManagement();

        manager.add("Write a test");

        assertEquals(
                "Write a test",
                manager.exerciseList().get(0).getName()
        );
    }

    @Test
    public void exerciseCanBeMarkedCompleted() {
        ExerciseManagement manager = new ExerciseManagement();

        manager.add("Write a test");
        manager.markAsCompleted("Write a test");

        assertTrue(manager.isCompleted("Write a test"));
    }

    @Test
    public void nonCompletedExerciseReturnsFalse() {
        ExerciseManagement manager = new ExerciseManagement();

        manager.add("Write a test");

        assertFalse(manager.isCompleted("Write a test"));
    }
}
