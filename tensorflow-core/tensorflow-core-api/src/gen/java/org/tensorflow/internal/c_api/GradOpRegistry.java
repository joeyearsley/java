// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


/** GradOpRegistry maintains a static registry of gradient functions.
 *  Gradient functions are indexed in the registry by the forward op name (i.e.
 *  "MatMul" -> MatMulGrad func). */
@Namespace("tensorflow::ops") @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class GradOpRegistry extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GradOpRegistry() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GradOpRegistry(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GradOpRegistry(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GradOpRegistry position(long position) {
        return (GradOpRegistry)super.position(position);
    }
    @Override public GradOpRegistry getPointer(long i) {
        return new GradOpRegistry((Pointer)this).offsetAddress(i);
    }

  /** Registers 'func' as the gradient function for 'op'.
   *  Returns true if registration was successful, check fails otherwise. */
  public native @Cast("bool") boolean Register(@StdString BytePointer op, GradFunc func);
  public native @Cast("bool") boolean Register(@StdString String op, GradFunc func);

  /** Sets 'func' to the gradient function for 'op' and returns Status OK if
   *  the gradient function for 'op' exists in the registry.
   *  Note that 'func' can be null for ops that have registered no-gradient with
   *  the registry.
   *  Returns error status otherwise. */
  public native @ByVal NativeStatus Lookup(@StdString BytePointer op, @ByPtrPtr GradFunc func);
  public native @ByVal NativeStatus Lookup(@StdString String op, @ByPtrPtr GradFunc func);

  /** Returns a pointer to the global gradient function registry. */
  public static native GradOpRegistry Global();
}
