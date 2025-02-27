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

package org.tensorflow.op.data;

import java.util.Arrays;
import java.util.List;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.TString;
import org.tensorflow.types.family.TType;

/**
 * A transformation that asserts which transformations happened previously.
 * This transformation checks the names and, optionally, the attribute name-value
 * pairs in the {@code transformations} argument against those of the transformations
 * that preceded this transformation.  If there is a mismatch, the transformation
 * raises an exception.
 * <p>The check occurs when iterating over the contents of the dataset, which
 * means that the check happens <em>after</em> any static optimizations are applied
 * to the dataset graph.
 */
@OpMetadata(
    opType = AssertPrevDataset.OP_NAME,
    inputsClass = AssertPrevDataset.Inputs.class
)
public final class AssertPrevDataset extends RawOp implements Operand<TType> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "AssertPrevDataset";

  private Output<? extends TType> handle;

  @SuppressWarnings("unchecked")
  public AssertPrevDataset(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new AssertPrevDataset operation.
   *
   * @param scope current scope
   * @param inputDataset A variant tensor representing the input dataset.
   * {@code data.AssertPrevDataset} passes through the outputs of its input dataset.
   * @param transformations A {@code tf.string} vector {@code tf.Tensor} identifying the transformations, with optional
   * attribute name-value pairs, that are expected to have happened previously.
   * @param outputTypes The value of the outputTypes attribute
   * @param outputShapes The value of the outputShapes attribute
   * @return a new instance of AssertPrevDataset
   */
  @Endpoint(
      describeByClass = true
  )
  public static AssertPrevDataset create(Scope scope, Operand<? extends TType> inputDataset,
      Operand<TString> transformations, List<Class<? extends TType>> outputTypes,
      List<Shape> outputShapes) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "AssertPrevDataset");
    opBuilder.addInput(inputDataset.asOutput());
    opBuilder.addInput(transformations.asOutput());
    opBuilder.setAttr("output_types", Operands.toDataTypes(outputTypes));
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0 ; i < outputShapesArray.length ; i++) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    return new AssertPrevDataset(opBuilder.build());
  }

  /**
   * Gets handle.
   *
   * @return handle.
   */
  public Output<? extends TType> handle() {
    return handle;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }

  @OpInputsMetadata(
      outputsClass = AssertPrevDataset.class
  )
  public static class Inputs extends RawOpInputs<AssertPrevDataset> {
    /**
     * A variant tensor representing the input dataset.
     * {@code data.AssertPrevDataset} passes through the outputs of its input dataset.
     */
    public final Operand<? extends TType> inputDataset;

    /**
     * A {@code tf.string} vector {@code tf.Tensor} identifying the transformations, with optional
     * attribute name-value pairs, that are expected to have happened previously.
     */
    public final Operand<TString> transformations;

    /**
     * The outputTypes attribute
     */
    public final DataType[] outputTypes;

    /**
     * The outputShapes attribute
     */
    public final Shape[] outputShapes;

    public Inputs(GraphOperation op) {
      super(new AssertPrevDataset(op), op, Arrays.asList("output_types", "output_shapes"));
      int inputIndex = 0;
      inputDataset = (Operand<? extends TType>) op.input(inputIndex++);
      transformations = (Operand<TString>) op.input(inputIndex++);
      outputTypes = op.attributes().getAttrTypeList("output_types");
      outputShapes = op.attributes().getAttrShapeList("output_shapes");
    }
  }
}
