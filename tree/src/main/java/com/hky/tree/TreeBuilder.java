package com.hky.tree;

import java.util.List;

import com.hky.tree.intf.Node;


/**
 * 树形结构数据构建器
 * 需传入两个实现类
 * TreeInfo 和 Node (一个空的实例即可)
 * 通过 tryAdd(Node) 方法将树形关系的数据组织起来
 * @author hky
 *
 */
@SuppressWarnings("rawtypes")
public class TreeBuilder<E extends Node> {
	
	private E rootNode;
	
	public TreeBuilder(E baseNode){
		this.rootNode=baseNode;
	}
	
	public E getRootNode() {
		return rootNode;
	}

	public void setRootNode(E rootNode) {
		this.rootNode = rootNode;
	}

	@SuppressWarnings({ "unchecked" })
	public List<E> tryAdd(E nodeNew){
		if(rootNode.getRootId().equals(nodeNew.getId())){
			rootNode.update(nodeNew);
			return rootNode.getChildren();
		}else{
			String parentId=rootNode.getParentId(nodeNew.getId());
			
			List<E> list=tryAdd((E)nodeNew.newNode(parentId));
			int index=list.indexOf(nodeNew);
			if(index>=0){
				Node eleExist=list.get(index);
				eleExist.update(nodeNew);
				return eleExist.getChildren();
			}else{
				list.add(nodeNew);
				return nodeNew.getChildren();
			}
		}
	}
}
