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

package org.tensorflow.op.xla;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * Wraps the XLA OptimizationBarrier operator.
 * Documented at https://www.tensorflow.org/xla/operation_semantics#optimizationbarrier.
 */
@OpMetadata(
    opType = OptimizationBarrier.OP_NAME,
    inputsClass = OptimizationBarrier.Inputs.class
)
@Operator(
    group = "xla"
)
public final class OptimizationBarrier extends RawOp implements Iterable<Operand<TType>> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "XlaOptimizationBarrier";

  private List<Output<?>> output;

  @SuppressWarnings("unchecked")
  public OptimizationBarrier(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    int outputLength = operation.outputListLength("output");
    output = Arrays.asList(operation.outputList(outputIdx, outputLength));
    outputIdx += outputLength;
  }

  /**
   * Factory method to create a class wrapping a new XlaOptimizationBarrier operation.
   *
   * @param scope current scope
   * @param input A Tuple of Arrays of any type.
   * @return a new instance of OptimizationBarrier
   */
  @Endpoint(
      describeByClass = true
  )
  public static OptimizationBarrier create(Scope scope, Iterable<Operand<?>> input) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "OptimizationBarrier");
    opBuilder.addInputList(Operands.asOutputs(input));
    return new OptimizationBarrier(opBuilder.build());
  }

  /**
   * Gets output.
   *
   * @return output.
   */
  public List<Output<?>> output() {
    return output;
  }

  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<TType>> iterator() {
    return (Iterator) output.iterator();
  }

  @OpInputsMetadata(
      outputsClass = OptimizationBarrier.class
  )
  public static class Inputs extends RawOpInputs<OptimizationBarrier> {
    /**
     * A Tuple of Arrays of any type.
     */
    public final Iterable<Operand<?>> input;

    /**
     * The T attribute
     */
    public final DataType[] T;

    public Inputs(GraphOperation op) {
      super(new OptimizationBarrier(op), op, Arrays.asList("T"));
      int inputIndex = 0;
      int inputLength = op.inputListLength("input");
      input = Arrays.asList((Operand<?>[]) op.inputList(inputIndex, inputLength));
      inputIndex += inputLength;
      T = op.attributes().getAttrTypeList("T");
    }
  }
}
