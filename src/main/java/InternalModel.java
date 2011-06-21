import java.awt.Point;
import java.util.Vector;

import javax.swing.JComponent;

import mcomponent.Merger;
import mcomponent.NServer;
import mcomponent.Server;
import mcomponent.Sink;
import mcomponent.Source;
import mcomponent.Splitter;
import mcomponent.distribution.CashierTransform;
import mcomponent.distribution.CustomerCreator;
import mcomponent.distribution.DefaultMergerModel2;
import mcomponent.distribution.DefaultSplitterModel2;
import mcomponent.distribution.DefaultTransform;
import mcomponent.distribution.DoorDistribution;
import mcomponent.distribution.UniformDistribution;
import mcomponent.queue.MessageQueueFIFO;
import statistic.AnalysisTool2;
import animation.AnimationLine;
import chart.Chart;
import engine.SimThread;
import engine.eventhandler.TerminationEventHandler;

public class InternalModel implements TerminationEventHandler {
    Source _Source1 = new Source("Door 1");
    Source _Source2 = new Source("Door 2");
    Merger _Merger1 = new Merger("Choose Queue", 2);
    Splitter _Splitter1 = new Splitter("Choose Queue", 2);
    Server _Server1 = new Server("Cashier 1");
    Server _Server2 = new Server("Cashier 2");
    Merger _Merger2 = new Merger("Merger", 2);
    Splitter _Splitter2 = new Splitter("Splitter", 2);
    Server _Server3 = new Server("Server");
    Server _Server4 = new Server("Server");
    Merger _Merger3 = new Merger("Merger", 2);
    Sink _Sink1 = new Sink("Exit");
    NServer _NServer1 = new NServer("Tables", 2);
    AnalysisTool2 _AnalysisTool21 = new AnalysisTool2("AnalysisTool");
    Chart _Chart1 = new Chart("Chart");
    AnimationLine _animationLine;
    String _animation;
    Point _point;
    Vector _vPoint;
    CustomerCreator _objectCreator1 = new CustomerCreator();
    DoorDistribution _distribution1 = new DoorDistribution();
    CustomerCreator _objectCreator2 = new CustomerCreator();
    DoorDistribution _distribution2 = new DoorDistribution();
    UniformDistribution _distribution3 = new UniformDistribution();
    CashierTransform _transform1 = new CashierTransform();
    UniformDistribution _distribution4 = new UniformDistribution();
    CashierTransform _transform2 = new CashierTransform();
    UniformDistribution _distribution5 = new UniformDistribution();
    DefaultTransform _transform3 = new DefaultTransform();
    UniformDistribution _distribution6 = new UniformDistribution();
    DefaultTransform _transform4 = new DefaultTransform();
    UniformDistribution _distribution7 = new UniformDistribution();
    DefaultTransform _transform5 = new DefaultTransform();

    public InternalModel(JComponent _sourcePane, JComponent _targetPane, int _speed) {
        MessageQueueFIFO virtualMessageQ1 = new MessageQueueFIFO("virtual queue");
        _Source2.setOutput(virtualMessageQ1);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(121, 253);
        _vPoint.add(_point);
        _point = new Point(161, 211);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ1.setReceiveAnimationLine(_animationLine);
        _Merger1.setInput(1, virtualMessageQ1);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ1.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ2 = new MessageQueueFIFO("virtual queue");
        _Source1.setOutput(virtualMessageQ2);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(125, 110);
        _vPoint.add(_point);
        _point = new Point(161, 160);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ2.setReceiveAnimationLine(_animationLine);
        _Merger1.setInput(0, virtualMessageQ2);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ2.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ3 = new MessageQueueFIFO("virtual queue");
        _Merger1.setOutput(virtualMessageQ3);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(265, 179);
        _vPoint.add(_point);
        _point = new Point(306, 179);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ3.setReceiveAnimationLine(_animationLine);
        _Splitter1.setInput(virtualMessageQ3);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ3.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ4 = new MessageQueueFIFO("virtual queue");
        _Splitter1.setOutput(1, virtualMessageQ4);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(410, 156);
        _vPoint.add(_point);
        _point = new Point(467, 100);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ4.setReceiveAnimationLine(_animationLine);
        _Server1.setInput(virtualMessageQ4);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ4.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ5 = new MessageQueueFIFO("virtual queue");
        _Splitter1.setOutput(0, virtualMessageQ5);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(410, 205);
        _vPoint.add(_point);
        _point = new Point(477, 250);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ5.setReceiveAnimationLine(_animationLine);
        _Server2.setInput(virtualMessageQ5);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ5.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ6 = new MessageQueueFIFO("virtual queue");
        _Server2.setOutput(virtualMessageQ6);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(581, 264);
        _vPoint.add(_point);
        _point = new Point(634, 335);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ6.setReceiveAnimationLine(_animationLine);
        _Merger2.setInput(0, virtualMessageQ6);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ6.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ7 = new MessageQueueFIFO("virtual queue");
        _Server1.setOutput(virtualMessageQ7);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(571, 100);
        _vPoint.add(_point);
        _point = new Point(662, 335);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ7.setReceiveAnimationLine(_animationLine);
        _Merger2.setInput(1, virtualMessageQ7);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ7.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ8 = new MessageQueueFIFO("virtual queue");
        _Merger2.setOutput(virtualMessageQ8);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(584, 401);
        _vPoint.add(_point);
        _point = new Point(541, 398);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ8.setReceiveAnimationLine(_animationLine);
        _Splitter2.setInput(virtualMessageQ8);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ8.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ9 = new MessageQueueFIFO("virtual queue");
        _Splitter2.setOutput(1, virtualMessageQ9);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(437, 379);
        _vPoint.add(_point);
        _point = new Point(376, 379);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ9.setReceiveAnimationLine(_animationLine);
        _Server3.setInput(virtualMessageQ9);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ9.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ10 = new MessageQueueFIFO("virtual queue");
        _Splitter2.setOutput(0, virtualMessageQ10);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(437, 413);
        _vPoint.add(_point);
        _point = new Point(375, 439);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ10.setReceiveAnimationLine(_animationLine);
        _Server4.setInput(virtualMessageQ10);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ10.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ11 = new MessageQueueFIFO("virtual queue");
        _Server3.setOutput(virtualMessageQ11);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(272, 370);
        _vPoint.add(_point);
        _point = new Point(155, 370);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ11.setReceiveAnimationLine(_animationLine);
        _Merger3.setInput(0, virtualMessageQ11);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ11.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ12 = new MessageQueueFIFO("virtual queue");
        _Server4.setOutput(virtualMessageQ12);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(271, 438);
        _vPoint.add(_point);
        _point = new Point(178, 404);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ12.setReceiveAnimationLine(_animationLine);
        _Merger3.setInput(1, virtualMessageQ12);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ12.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ13 = new MessageQueueFIFO("virtual queue");
        _Merger3.setOutput(virtualMessageQ13);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(129, 470);
        _vPoint.add(_point);
        _point = new Point(191, 539);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ13.setReceiveAnimationLine(_animationLine);
        _NServer1.setInput(virtualMessageQ13);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ13.setSendAnimationLine(_animationLine);
        MessageQueueFIFO virtualMessageQ14 = new MessageQueueFIFO("virtual queue");
        _NServer1.setOutput(virtualMessageQ14);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _point = new Point(295, 542);
        _vPoint.add(_point);
        _point = new Point(427, 542);
        _vPoint.add(_point);
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ14.setReceiveAnimationLine(_animationLine);
        _Sink1.setInput(virtualMessageQ14);
        _animationLine = new AnimationLine();
        _animationLine.setSourcePane(_sourcePane);
        _animationLine.setTargetPane(_targetPane);
        _vPoint = new Vector();
        _animationLine.setPath(_vPoint);
        _animationLine.setSpeed(_speed);
        virtualMessageQ14.setSendAnimationLine(_animationLine);
        _AnalysisTool21.addStartPoint(_Server1, "Input");
        _AnalysisTool21.addEndPoint(_Server1, "Output");

        _Source1.setObjectCreator(_objectCreator1);
        _Source1.setDistribution(_distribution1);
        _Source2.setObjectCreator(_objectCreator2);
        _Source2.setDistribution(_distribution2);
        _Merger1.setMergerModel(new DefaultMergerModel2());
        _Splitter1.setSplitterModel(new DefaultSplitterModel2());
        _distribution3.setUpperLimit(180.0);
        _distribution3.setLowerLimit(60.0);
        _Server1.setDistribution(_distribution3);
        _Server1.setTransform(_transform1);
        _distribution4.setUpperLimit(360.0);
        _distribution4.setLowerLimit(300.0);
        _Server2.setDistribution(_distribution4);
        _Server2.setTransform(_transform2);
        _Merger2.setMergerModel(new DefaultMergerModel2());
        _Splitter2.setSplitterModel(new DefaultSplitterModel2());
        _distribution5.setUpperLimit(1.0);
        _distribution5.setLowerLimit(1.0);
        _Server3.setDistribution(_distribution5);
        _Server3.setTransform(_transform3);
        _distribution6.setUpperLimit(1.0);
        _distribution6.setLowerLimit(1.0);
        _Server4.setDistribution(_distribution6);
        _Server4.setTransform(_transform4);
        _Merger3.setMergerModel(new DefaultMergerModel2());
        _distribution7.setUpperLimit(5.0);
        _distribution7.setLowerLimit(5.0);
        _NServer1.setDistribution(_distribution7);
        _NServer1.setTransform(_transform5);

        _AnalysisTool21.setStartTime(0);
        _AnalysisTool21.setAnalyzeTime(-1);

    }

    public void start() {
        _Source1.start();
        _Source2.start();
        _Merger1.start();
        _Splitter1.start();
        _Server1.start();
        _Server2.start();
        _Merger2.start();
        _Splitter2.start();
        _Server3.start();
        _Server4.start();
        _Merger3.start();
        _Sink1.start();
        _NServer1.start();

        processAddTerminationEvent();
    }

    public void processAddTerminationEvent() {

        SimThread.getSimSystemData().addEvent(new engine.Event(400, this, "Termination", null));
    }

    public void processTerminationEvent(engine.Event _event) {

        _AnalysisTool21.display();
        AnalysisTool2.displayAll();
    }

}
