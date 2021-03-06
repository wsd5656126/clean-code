package c14.author;

import java.util.ListIterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    //这种命名值得学习
    private boolean booleanValue = false;

    @Override
    public void set(ListIterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }

    public static boolean getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof BooleanArgumentMarshaler)
            return ((BooleanArgumentMarshaler) am).booleanValue;
        else
            return false;
    }
}
