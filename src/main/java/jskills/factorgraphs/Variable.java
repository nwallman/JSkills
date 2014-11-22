package jskills.factorgraphs;


public class Variable<TValue> {
    private final String name;
    private final TValue prior;

    private TValue value;

    public Variable(String name, TValue prior) {
        this.name = name;
        this.prior = prior;
    }

    public Variable(TValue prior, String name, Object... args) {
        this.name = "Variable[" + String.format(name, args) + "]";
        this.prior = prior;
        resetToPrior();
    }

    public void resetToPrior() {
        value = prior;
    }

    @Override
    public String toString() {
        return name;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }
}