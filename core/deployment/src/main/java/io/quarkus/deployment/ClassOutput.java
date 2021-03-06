package io.quarkus.deployment;

import java.io.IOException;
import java.io.Writer;

import io.quarkus.gizmo.NullWriter;

/**
 * Interface that represents a target for generated bytecode
 */
public interface ClassOutput {

    /**
     * Writes some generate bytecode to an output target
     *
     * @param className The class name
     * @param data The bytecode bytes
     * @throws IOException If the class cannot be written
     */
    void writeClass(boolean applicationClass, String className, byte[] data) throws IOException;

    void writeResource(String name, byte[] data) throws IOException;

    default Writer writeSource(String className) {
        return NullWriter.INSTANCE;
    }

}
