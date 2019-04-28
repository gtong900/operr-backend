import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
	private LinkedList list = new LinkedList();
	private String expected;

	@AfterEach
	public void runProcessor() {
		String actual = list.printList();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Appending Elements")
	public void test1() {
		list.append(1);
		list.append(2);
		expected = "1 2 ";
	}

	@Test
	@DisplayName("Remove Tail Element")
	public void test2() {
		list.append(1);
		list.append(2);
		list.removeFromTail();
		expected = "1 ";
	}

	@Test
	@DisplayName("Remove Elements Greater than A Target Number")
	public void test3() {
		list.append(10);
		list.append(2);
		list.append(-1);
		list.append(12);
		list.append(8);
		list.append(9);
		list.removeElement(9);
		expected = "2 -1 8 9 ";
	}
}
