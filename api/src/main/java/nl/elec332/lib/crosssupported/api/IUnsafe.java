package nl.elec332.lib.crosssupported.api;

/**
 * Created by Elec332 on 21-4-2020
 */
public interface IUnsafe {

    byte getByte(long address);

    void putByte(long address, byte x);

    short getShort(long address);

    void putShort(long address, short x);

    char getChar(long address);

    void putChar(long address, char x);

    int getInt(long address);

    void putInt(long address, int x);

    long getLong(long address);

    void putLong(long address, long x);

    float getFloat(long address);

    void putFloat(long address, float x);

    double getDouble(long address);

    void putDouble(long address, double x);

    int getInt(Object o, long address);

    void putInt(Object o, long address, int x);

    Object getObject(Object o, long address);

    void putObject(Object o, long address, Object x);

    boolean getBoolean(Object o, long address);

    void putBoolean(Object o, long address, boolean x);

    byte getByte(Object o, long address);

    void putByte(Object o, long address, byte x);

    short getShort(Object o, long address);

    void putShort(Object o, long address, short x);

    char getChar(Object o, long address);

    void putChar(Object o, long address, char x);

    long getLong(Object o, long address);

    void putLong(Object o, long address, long x);

    float getFloat(Object o, long address);

    void putFloat(Object o, long address, float x);

    double getDouble(Object o, long address);

    void putDouble(Object o, long address, double x);



    long getAddress(long address);

    void putAddress(long address, long x);

    long allocateMemory(long bytes);

    long reallocateMemory(long address, long bytes);

    void setMemory(Object o, long offset, long bytes, byte value);

    default void setMemory(long address, long bytes, byte value) {
        setMemory(null, address, bytes, value);
    }

    void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes);

    default void copyMemory(long srcAddress, long destAddress, long bytes) {
        copyMemory(null, srcAddress, null, destAddress, bytes);
    }

    void freeMemory(long address);
    
}
