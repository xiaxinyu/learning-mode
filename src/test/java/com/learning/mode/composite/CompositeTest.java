package com.learning.mode.composite;

import org.apache.log4j.Logger;
import org.junit.Test;

public class CompositeTest {
	private Logger logger = Logger.getLogger(CompositeTest.class);
	@Test
	public void testComposite(){
		Node root = new CompositeNode("root");
		Node firstNode = new CompositeNode("firstNode");
		Node secondNode = new CompositeNode("secondNode");
		Node thirdNode = new CompositeNode("thirdNode");
		Node firstLeaf = new Element("firstLeaf");
		Node secondLeaf = new Element("secondLeaf");
		Node thirdLeaf = new Element("thirdLeaf");
		
		root.addNode(firstNode);
		root.addNode(secondNode);
		root.addNode(thirdNode);
		
		firstNode.addNode(firstLeaf);
		secondNode.addNode(secondLeaf);
		thirdNode.addNode(thirdLeaf);
		
		String path = root.getNodePath();
		logger.info(path);
	}
}
