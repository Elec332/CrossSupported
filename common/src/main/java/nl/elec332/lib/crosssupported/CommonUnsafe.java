package nl.elec332.lib.crosssupported;

import nl.elec332.lib.crosssupported.api.IUnsafe;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by Elec332 on 21-4-2020
 */
class CommonUnsafe implements IUnsafe {

    private static final Unsafe UNSAFE;

    static {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            UNSAFE = (Unsafe) f.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte getByte(long address) {
        return UNSAFE.getByte(address);
    }

    @Override
    public void putByte(long address, byte x) {
        UNSAFE.putByte(address, x);
    }

    @Override
    public short getShort(long address) {
        return UNSAFE.getShort(address);
    }

    @Override
    public void putShort(long address, short x) {
        UNSAFE.putShort(address, x);
    }

    @Override
    public char getChar(long address) {
        return UNSAFE.getChar(address);
    }

    @Override
    public void putChar(long address, char x) {
        UNSAFE.putChar(address, x);
    }

    @Override
    public int getInt(long address) {
        return UNSAFE.getInt(address);
    }

    @Override
    public void putInt(long address, int x) {
        UNSAFE.putInt(address, x);
    }

    @Override
    public long getLong(long address) {
        return UNSAFE.getLong(address);
    }

    @Override
    public void putLong(long address, long x) {
        UNSAFE.putLong(address, x);
    }

    @Override
    public float getFloat(long address) {
        return UNSAFE.getFloat(address);
    }

    @Override
    public void putFloat(long address, float x) {
        UNSAFE.putFloat(address, x);
    }

    @Override
    public double getDouble(long address) {
        return UNSAFE.getDouble(address);
    }

    @Override
    public void putDouble(long address, double x) {
        UNSAFE.putDouble(address, x);
    }

    @Override
    public int getInt(Object o, long address) {
        return UNSAFE.getInt(o, address);
    }

    @Override
    public void putInt(Object o, long address, int x) {
        UNSAFE.putInt(o, address, x);
    }

    @Override
    public Object getObject(Object o, long address) {
        return UNSAFE.getObject(o, address);
    }

    @Override
    public void putObject(Object o, long address, Object x) {
        UNSAFE.putObject(o, address, x);
    }

    @Override
    public boolean getBoolean(Object o, long address) {
        return UNSAFE.getBoolean(o, address);
    }

    @Override
    public void putBoolean(Object o, long address, boolean x) {
        UNSAFE.putBoolean(o, address, x);
    }

    @Override
    public byte getByte(Object o, long address) {
        return UNSAFE.getByte(o, address);
    }

    @Override
    public void putByte(Object o, long address, byte x) {
        UNSAFE.putByte(o, address, x);
    }

    @Override
    public short getShort(Object o, long address) {
        return UNSAFE.getShort(o, address);
    }

    @Override
    public void putShort(Object o, long address, short x) {
        UNSAFE.putShort(o, address, x);
    }

    @Override
    public char getChar(Object o, long address) {
        return UNSAFE.getChar(o, address);
    }

    @Override
    public void putChar(Object o, long address, char x) {
        UNSAFE.putChar(o, address, x);
    }

    @Override
    public long getLong(Object o, long address) {
        return UNSAFE.getLong(o, address);
    }

    @Override
    public void putLong(Object o, long address, long x) {
        UNSAFE.putLong(o, address, x);
    }

    @Override
    public float getFloat(Object o, long address) {
        return UNSAFE.getFloat(o, address);
    }

    @Override
    public void putFloat(Object o, long address, float x) {
        UNSAFE.putFloat(o, address, x);
    }

    @Override
    public double getDouble(Object o, long address) {
        return UNSAFE.getDouble(o, address);
    }

    @Override
    public void putDouble(Object o, long address, double x) {
        UNSAFE.putDouble(o, address, x);
    }


    @Override
    public long getAddress(long address) {
        return UNSAFE.getAddress(address);
    }

    @Override
    public void putAddress(long address, long x) {
        UNSAFE.putAddress(address, x);
    }

    @Override
    public long allocateMemory(long bytes) {
        return UNSAFE.allocateMemory(bytes);
    }

    @Override
    public long reallocateMemory(long address, long bytes) {
        return UNSAFE.reallocateMemory(address, bytes);
    }

    @Override
    public void setMemory(Object o, long offset, long bytes, byte value) {
        UNSAFE.setMemory(o, offset, bytes, value);
    }

    @Override
    public void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes) {
        UNSAFE.copyMemory(srcBase, srcOffset, destBase, destOffset, bytes);
    }

    @Override
    public void freeMemory(long address) {
        UNSAFE.freeMemory(address);
    }

}
