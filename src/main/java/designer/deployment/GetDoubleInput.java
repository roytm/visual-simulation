package designer.deployment;

public class GetDoubleInput extends GetDataInput {
    /**
     * 
     */
    private static final long serialVersionUID = -2146981543388058960L;

    public GetDoubleInput() {
    }

    public Object getInput(String s, InputComponent object) throws InvalidDataException {
        Double input;
        try {
            input = new Double(s);
        } catch (Exception e) {
            String label = object.getText(InputComponent.LABEL);
            label = label.substring(0, label.lastIndexOf(":"));
            throw new InvalidDataException(label + " should be a integer or decimal number.");// Temp
                                                                                              // &
                                                                                              // test
        }
        return input;
    }
}
