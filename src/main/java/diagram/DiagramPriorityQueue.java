package diagram;

/**
 * Title: Description: Copyright: Copyright (c) 2001 Company:
 * 
 * @author
 * @version 1.0
 */

public class DiagramPriorityQueue extends DiagramMessageQueue {

    /**
     * 
     */
    private static final long serialVersionUID = -5105042580689364448L;

    public DiagramPriorityQueue() {
        super();

        _properties.add(new Property("java.lang.String", "Name", new String("Pirority Queue")));
        _properties.add(new Property("mcomponent.distribution.PriorityModel", "Priority Model", null));
        _properties.add(new Property("java.lang.Integer", "Queue Limit", new Integer(-1)));
    }

    // Testing!!!!
    public void setPort() {
        try {
            addPort(this, DiagramPort.OUTPORT);
            addPort(this, DiagramPort.INPORT);
            addPort(this, DiagramPort.EXITPORT);
        } catch (Exception e) {
        }
    }
}
