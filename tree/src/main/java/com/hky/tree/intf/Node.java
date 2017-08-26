package com.hky.tree.intf;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface Node<E extends Node> {
	
	public String getId();
	public void setId(String id);
	public List<E> getChildren();
	public void update(E nodeNew);
	public E newNode(String id);
	public void addChild(E nodeNew);
	public boolean equal(E nodeNew);
	public String getRootId();
	public String getParentId(String id);
}
