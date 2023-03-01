package sealed.classes;

public sealed interface SealedInterface permits ObjectA, ObjectB, ObjectC {
    public String getMessage();
}
