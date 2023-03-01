package sealed.classes;

public final class ObjectA implements SealedInterface {

    @Override
    public String getMessage() {
        return "ObjectA::getMessage";
    }
}
