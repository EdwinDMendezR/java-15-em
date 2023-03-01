package sealed.classes;

public final class ObjectB implements SealedInterface {
    @Override
    public String getMessage() {
        return "ObjectB::getMessage";
    }
}
