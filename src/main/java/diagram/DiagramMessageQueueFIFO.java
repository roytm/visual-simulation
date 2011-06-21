package diagram;
import javax.swing.JComponent;
import java.awt.*;
import java.lang.reflect.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class DiagramMessageQueueFIFO extends DiagramMessageQueue {
	
	public DiagramMessageQueueFIFO() {
		super();
		
		_properties.add(new Property("java.lang.String", "Name", new String("FIFO Queue")));
		_properties.add(new Property("java.lang.Integer", "Queue Limit", new Integer(-1)));
	}
	
	//Testing!!!!
	public void setPort() {
		try {
			addPort(this, DiagramPort.OUTPORT);
			addPort(this, DiagramPort.INPORT);
			addPort(this, DiagramPort.EXITPORT);
		}
		catch (Exception e) {
 		}
	}
}