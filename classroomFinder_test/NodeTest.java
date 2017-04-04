import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NodeTest {
	@Test
	public void testGetType() {
		Node testNode1 = new Node(NodeType.normal, 1000, 5000, "Lids");
		Node testNode2 = new Node(NodeType.stair, 7, 6657, "Stair 2");
		Node testNode3 = new Node(NodeType.elevator, 1223, 4352, "Elevator 22");
		assertEquals(NodeType.normal, testNode1.getType());
		assertEquals(NodeType.stair, testNode2.getType());
		assertEquals(NodeType.elevator, testNode3.getType());
	}

	@Test
	public void testGetRelativeX() {
		Node testNode1 = new Node(NodeType.normal, 1000, 5000, "Lids");
		Node testNode2 = new Node(NodeType.stair, 7, 6657, "Stair 2");
		Node testNode3 = new Node(NodeType.elevator, 1223, 4352, "Elevator 22");
		assertEquals(1000, testNode1.getRelativeX());
		assertEquals(7, testNode2.getRelativeX());
		assertEquals(1223, testNode3.getRelativeX());
	}

	@Test
	public void testGetRelativeY() {
		Node testNode1 = new Node(NodeType.normal, 1000, 5000, "Lids");
		Node testNode2 = new Node(NodeType.stair, 7, 6657, "Stair 2");
		Node testNode3 = new Node(NodeType.elevator, 1223, 4352, "Elevator 22");
		assertEquals(5000, testNode1.getRelativeY());
		assertEquals(6657, testNode2.getRelativeY());
		assertEquals(4352, testNode3.getRelativeY());
	}

	@Test
	public void testGetName() {
		Node testNode1 = new Node(NodeType.normal, 1000, 5000, "Lids");
		Node testNode2 = new Node(NodeType.stair, 7, 6657, "Stair 2");
		Node testNode3 = new Node(NodeType.elevator, 1223, 4352, "Elevator 22");
		assertEquals("Lids", testNode1.getName());
		assertEquals("Stair 2", testNode2.getName());
		assertEquals("Elevator 22", testNode3.getName());
	}

}
