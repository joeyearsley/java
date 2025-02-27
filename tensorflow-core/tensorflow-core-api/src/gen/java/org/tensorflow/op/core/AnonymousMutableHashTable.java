/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.core;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Creates an empty anonymous mutable hash table.
 * This op creates a new anonymous mutable hash table (as a resource) everytime
 * it is executed, with the specified dtype of its keys and values,
 * returning the resource handle. Each value must be a scalar.
 * Data can be inserted into the table using
 * the insert operations. It does not support the initialization operation.
 * The table is anonymous in the sense that it can only be
 * accessed by the returned resource handle (e.g. it cannot be looked up
 * by a name in a resource manager). The table will be automatically
 * deleted when all resource handles pointing to it are gone.
 */
@OpMetadata(
    opType = AnonymousMutableHashTable.OP_NAME,
    inputsClass = AnonymousMutableHashTable.Inputs.class
)
public final class AnonymousMutableHashTable extends RawOp implements Operand<TType> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "AnonymousMutableHashTable";

  private Output<? extends TType> tableHandle;

  @SuppressWarnings("unchecked")
  public AnonymousMutableHashTable(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    tableHandle = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new AnonymousMutableHashTable operation.
   *
   * @param scope current scope
   * @param keyDtype Type of the table keys.
   * @param valueDtype Type of the table values.
   * @param <T> data type for {@code AnonymousMutableHashTable} output and operands
   * @param <U> data type for {@code AnonymousMutableHashTable} output and operands
   * @return a new instance of AnonymousMutableHashTable
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType, U extends TType> AnonymousMutableHashTable create(Scope scope,
      Class<T> keyDtype, Class<U> valueDtype) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "AnonymousMutableHashTable");
    opBuilder.setAttr("key_dtype", Operands.toDataType(keyDtype));
    opBuilder.setAttr("value_dtype", Operands.toDataType(valueDtype));
    return new AnonymousMutableHashTable(opBuilder.build());
  }

  /**
   * Gets tableHandle.
   * The resource handle to the newly created hash-table resource.
   * @return tableHandle.
   */
  public Output<? extends TType> tableHandle() {
    return tableHandle;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) tableHandle;
  }

  @OpInputsMetadata(
      outputsClass = AnonymousMutableHashTable.class
  )
  public static class Inputs extends RawOpInputs<AnonymousMutableHashTable> {
    /**
     * Type of the table keys.
     */
    public final DataType keyDtype;

    /**
     * Type of the table values.
     */
    public final DataType valueDtype;

    public Inputs(GraphOperation op) {
      super(new AnonymousMutableHashTable(op), op, Arrays.asList("key_dtype", "value_dtype"));
      int inputIndex = 0;
      keyDtype = op.attributes().getAttrType("key_dtype");
      valueDtype = op.attributes().getAttrType("value_dtype");
    }
  }
}
