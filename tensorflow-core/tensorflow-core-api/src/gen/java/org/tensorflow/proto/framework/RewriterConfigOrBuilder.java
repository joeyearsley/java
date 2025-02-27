// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/rewriter_config.proto

package org.tensorflow.proto.framework;

public interface RewriterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RewriterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * CPU Conversion settings between NHCW and NCHW.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.CpuLayout cpu_layout_conversion = 50;</code>
   */
  int getCpuLayoutConversionValue();
  /**
   * <pre>
   * CPU Conversion settings between NHCW and NCHW.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.CpuLayout cpu_layout_conversion = 50;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.CpuLayout getCpuLayoutConversion();

  /**
   * <pre>
   * Optimize tensor layouts (default is ON)
   * e.g. This will try to use NCHW layout on GPU which is faster.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle layout_optimizer = 1;</code>
   */
  int getLayoutOptimizerValue();
  /**
   * <pre>
   * Optimize tensor layouts (default is ON)
   * e.g. This will try to use NCHW layout on GPU which is faster.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle layout_optimizer = 1;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getLayoutOptimizer();

  /**
   * <pre>
   * Fold constants (default is ON)
   * Statically infer the value of tensors when possible, and materialize the
   * result using constants.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle constant_folding = 3;</code>
   */
  int getConstantFoldingValue();
  /**
   * <pre>
   * Fold constants (default is ON)
   * Statically infer the value of tensors when possible, and materialize the
   * result using constants.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle constant_folding = 3;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getConstantFolding();

  /**
   * <pre>
   * Shape optimizations (default is ON)
   * Simplify computations made on shapes.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle shape_optimization = 13;</code>
   */
  int getShapeOptimizationValue();
  /**
   * <pre>
   * Shape optimizations (default is ON)
   * Simplify computations made on shapes.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle shape_optimization = 13;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getShapeOptimization();

  /**
   * <pre>
   * Remapping (default is ON)
   * Remap subgraphs onto more efficient implementations.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle remapping = 14;</code>
   */
  int getRemappingValue();
  /**
   * <pre>
   * Remapping (default is ON)
   * Remap subgraphs onto more efficient implementations.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle remapping = 14;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getRemapping();

  /**
   * <pre>
   * Common subgraph elimination (default is ON)
   * e.g. Simplify arithmetic ops; merge ops with same value (like constants).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle common_subgraph_elimination = 24;</code>
   */
  int getCommonSubgraphEliminationValue();
  /**
   * <pre>
   * Common subgraph elimination (default is ON)
   * e.g. Simplify arithmetic ops; merge ops with same value (like constants).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle common_subgraph_elimination = 24;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getCommonSubgraphElimination();

  /**
   * <pre>
   * Arithmetic optimizations (default is ON)
   * e.g. Simplify arithmetic ops; merge ops with same value (like constants).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle arithmetic_optimization = 7;</code>
   */
  int getArithmeticOptimizationValue();
  /**
   * <pre>
   * Arithmetic optimizations (default is ON)
   * e.g. Simplify arithmetic ops; merge ops with same value (like constants).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle arithmetic_optimization = 7;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getArithmeticOptimization();

  /**
   * <pre>
   * Control dependency optimizations (default is ON).
   * Remove redundant control dependencies, which may enable other optimization.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle dependency_optimization = 8;</code>
   */
  int getDependencyOptimizationValue();
  /**
   * <pre>
   * Control dependency optimizations (default is ON).
   * Remove redundant control dependencies, which may enable other optimization.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle dependency_optimization = 8;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getDependencyOptimization();

  /**
   * <pre>
   * Loop optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle loop_optimization = 9;</code>
   */
  int getLoopOptimizationValue();
  /**
   * <pre>
   * Loop optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle loop_optimization = 9;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getLoopOptimization();

  /**
   * <pre>
   * Function optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle function_optimization = 10;</code>
   */
  int getFunctionOptimizationValue();
  /**
   * <pre>
   * Function optimizations (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle function_optimization = 10;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getFunctionOptimization();

  /**
   * <pre>
   * Strips debug-related nodes from the graph (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle debug_stripper = 11;</code>
   */
  int getDebugStripperValue();
  /**
   * <pre>
   * Strips debug-related nodes from the graph (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle debug_stripper = 11;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getDebugStripper();

  /**
   * <pre>
   * If true, don't remove unnecessary ops from the graph
   * </pre>
   *
   * <code>bool disable_model_pruning = 2;</code>
   */
  boolean getDisableModelPruning();

  /**
   * <pre>
   * Try to allocate some independent Op outputs contiguously in order to
   * merge or eliminate downstream Ops (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle scoped_allocator_optimization = 15;</code>
   */
  int getScopedAllocatorOptimizationValue();
  /**
   * <pre>
   * Try to allocate some independent Op outputs contiguously in order to
   * merge or eliminate downstream Ops (off by default).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle scoped_allocator_optimization = 15;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getScopedAllocatorOptimization();

  /**
   * <pre>
   * Force small ops onto the CPU (default is OFF).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle pin_to_host_optimization = 18;</code>
   */
  int getPinToHostOptimizationValue();
  /**
   * <pre>
   * Force small ops onto the CPU (default is OFF).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle pin_to_host_optimization = 18;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getPinToHostOptimization();

  /**
   * <pre>
   * Enable the swap of kernel implementations based on the device placement
   * (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle implementation_selector = 22;</code>
   */
  int getImplementationSelectorValue();
  /**
   * <pre>
   * Enable the swap of kernel implementations based on the device placement
   * (default is ON).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle implementation_selector = 22;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getImplementationSelector();

  /**
   * <pre>
   * Optimize data types for CUDA (default is OFF).
   * This will try to use float16 on GPU which is faster.
   * Note that this can change the numerical stability of the graph and may
   * require the use of loss scaling to maintain model convergence.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle auto_mixed_precision = 23;</code>
   */
  int getAutoMixedPrecisionValue();
  /**
   * <pre>
   * Optimize data types for CUDA (default is OFF).
   * This will try to use float16 on GPU which is faster.
   * Note that this can change the numerical stability of the graph and may
   * require the use of loss scaling to maintain model convergence.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle auto_mixed_precision = 23;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getAutoMixedPrecision();

  /**
   * <pre>
   * Optimize data types for MKL (default is OFF).
   * This will try to use bfloat16 on CPUs, which is faster.
   * Note that this can change the numerical stability of the graph.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle auto_mixed_precision_mkl = 25;</code>
   */
  int getAutoMixedPrecisionMklValue();
  /**
   * <pre>
   * Optimize data types for MKL (default is OFF).
   * This will try to use bfloat16 on CPUs, which is faster.
   * Note that this can change the numerical stability of the graph.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle auto_mixed_precision_mkl = 25;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getAutoMixedPrecisionMkl();

  /**
   * <pre>
   * Emulate a model using data type float16 on CPU (default is OFF).
   * This will try to emulate the float16 inputs and outputs of an operator
   * on CPU to have better correlation with float16 on GPU; however the
   * computation in the operator is based on float32.
   * Note that this can change the numerical stability of the graph.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle auto_mixed_precision_cpu = 29;</code>
   */
  int getAutoMixedPrecisionCpuValue();
  /**
   * <pre>
   * Emulate a model using data type float16 on CPU (default is OFF).
   * This will try to emulate the float16 inputs and outputs of an operator
   * on CPU to have better correlation with float16 on GPU; however the
   * computation in the operator is based on float32.
   * Note that this can change the numerical stability of the graph.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle auto_mixed_precision_cpu = 29;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getAutoMixedPrecisionCpu();

  /**
   * <pre>
   * Disable the entire meta optimizer (off by default).
   * </pre>
   *
   * <code>bool disable_meta_optimizer = 19;</code>
   */
  boolean getDisableMetaOptimizer();

  /**
   * <pre>
   * Optimizers registered by plugin (default is ON)
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle use_plugin_optimizers = 28;</code>
   */
  int getUsePluginOptimizersValue();
  /**
   * <pre>
   * Optimizers registered by plugin (default is ON)
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.Toggle use_plugin_optimizers = 28;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.Toggle getUsePluginOptimizers();

  /**
   * <pre>
   * Controls how many times we run the optimizers in meta optimizer (default
   * is once).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.NumIterationsType meta_optimizer_iterations = 12;</code>
   */
  int getMetaOptimizerIterationsValue();
  /**
   * <pre>
   * Controls how many times we run the optimizers in meta optimizer (default
   * is once).
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.NumIterationsType meta_optimizer_iterations = 12;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.NumIterationsType getMetaOptimizerIterations();

  /**
   * <pre>
   * The minimum number of nodes in a graph to optimizer. For smaller graphs,
   * optimization is skipped.
   * 0 means the system picks an appropriate number.
   * &lt; 0 means do not skip optimization.
   * </pre>
   *
   * <code>int32 min_graph_nodes = 17;</code>
   */
  int getMinGraphNodes();

  /**
   * <pre>
   * Disable optimizations that assume compressed tensors. Note that this flag
   * is experimental and may be removed in the future.
   * </pre>
   *
   * <code>bool experimental_disable_compressed_tensor_optimization = 26;</code>
   */
  boolean getExperimentalDisableCompressedTensorOptimization();

  /**
   * <pre>
   * Disable folding quantization emulation ops such as FakeQuantWithMinMax* and
   * QuantizeAndDequantize*. Some compilers (e.g. the TF-to-tflite converter)
   * have to extract quantization configs (e.g. min/max range, number of bits,
   * and per-channel) from the quantization emulation ops. Note that this flag
   * is experimental and may be removed in the future. See b/174138564 for more
   * details.
   * </pre>
   *
   * <code>bool experimental_disable_folding_quantization_emulation = 27;</code>
   */
  boolean getExperimentalDisableFoldingQuantizationEmulation();

  /**
   * <pre>
   * Configures memory optimization passes through the meta-optimizer. Has no
   * effect on manually requested memory optimization passes in the optimizers
   * field.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.MemOptType memory_optimization = 4;</code>
   */
  int getMemoryOptimizationValue();
  /**
   * <pre>
   * Configures memory optimization passes through the meta-optimizer. Has no
   * effect on manually requested memory optimization passes in the optimizers
   * field.
   * </pre>
   *
   * <code>.tensorflow.RewriterConfig.MemOptType memory_optimization = 4;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.MemOptType getMemoryOptimization();

  /**
   * <pre>
   * A node name scope for node names which are valid outputs of recomputations.
   * Inputs to nodes that match this scope may be recomputed (subject either to
   * manual annotation of those input nodes or to manual annotation and
   * heuristics depending on memory_optimization), but the nodes themselves will
   * not be recomputed. This matches any sub-scopes as well, meaning the scope
   * can appear not just as a top-level scope. For example, if the value is
   * "gradients/", the default, it will match node name "gradients/foo",
   * "foo/gradients/bar", but not "foo_gradients/"
   * </pre>
   *
   * <code>string memory_optimizer_target_node_name_scope = 6;</code>
   */
  java.lang.String getMemoryOptimizerTargetNodeNameScope();
  /**
   * <pre>
   * A node name scope for node names which are valid outputs of recomputations.
   * Inputs to nodes that match this scope may be recomputed (subject either to
   * manual annotation of those input nodes or to manual annotation and
   * heuristics depending on memory_optimization), but the nodes themselves will
   * not be recomputed. This matches any sub-scopes as well, meaning the scope
   * can appear not just as a top-level scope. For example, if the value is
   * "gradients/", the default, it will match node name "gradients/foo",
   * "foo/gradients/bar", but not "foo_gradients/"
   * </pre>
   *
   * <code>string memory_optimizer_target_node_name_scope = 6;</code>
   */
  com.google.protobuf.ByteString
      getMemoryOptimizerTargetNodeNameScopeBytes();

  /**
   * <pre>
   * Maximum number of milliseconds to spend optimizing a single graph before
   * timing out. If less than or equal to 0 (default value) the optimizer will
   * never time out.
   * </pre>
   *
   * <code>int64 meta_optimizer_timeout_ms = 20;</code>
   */
  long getMetaOptimizerTimeoutMs();

  /**
   * <pre>
   * Configures AutoParallel optimization passes either through the
   * meta-optimizer or when manually specified through the optimizers field.
   * </pre>
   *
   * <code>.tensorflow.AutoParallelOptions auto_parallel = 5;</code>
   */
  boolean hasAutoParallel();
  /**
   * <pre>
   * Configures AutoParallel optimization passes either through the
   * meta-optimizer or when manually specified through the optimizers field.
   * </pre>
   *
   * <code>.tensorflow.AutoParallelOptions auto_parallel = 5;</code>
   */
  org.tensorflow.proto.framework.AutoParallelOptions getAutoParallel();
  /**
   * <pre>
   * Configures AutoParallel optimization passes either through the
   * meta-optimizer or when manually specified through the optimizers field.
   * </pre>
   *
   * <code>.tensorflow.AutoParallelOptions auto_parallel = 5;</code>
   */
  org.tensorflow.proto.framework.AutoParallelOptionsOrBuilder getAutoParallelOrBuilder();

  /**
   * <pre>
   * If true, any optimization pass failing will cause the MetaOptimizer to
   * stop with an error. By default - or when set to false, failing passes are
   * skipped silently.
   * </pre>
   *
   * <code>bool fail_on_optimizer_errors = 21;</code>
   */
  boolean getFailOnOptimizerErrors();

  /**
   * <code>.tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;</code>
   */
  boolean hasScopedAllocatorOpts();
  /**
   * <code>.tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;</code>
   */
  org.tensorflow.proto.framework.ScopedAllocatorOptions getScopedAllocatorOpts();
  /**
   * <code>.tensorflow.ScopedAllocatorOptions scoped_allocator_opts = 16;</code>
   */
  org.tensorflow.proto.framework.ScopedAllocatorOptionsOrBuilder getScopedAllocatorOptsOrBuilder();

  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  java.util.List<java.lang.String>
      getOptimizersList();
  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  int getOptimizersCount();
  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  java.lang.String getOptimizers(int index);
  /**
   * <pre>
   * If non-empty, will use this as an alternative way to specify a list of
   * optimizations to turn on and the order of the optimizations (replacing the
   * meta-optimizer).
   * Of the RewriterConfig options, only the AutoParallel configuration options
   * (the auto_parallel field) apply to manually requested optimization passes
   * ("autoparallel"). Memory optimization passes ("memory") invoked here are
   * not configurable (in contrast to memory optimization passes through the
   * meta-optimizer) and act only on manual op annotations.
   * Custom optimizers (see custom_optimizers) that are not part of this
   * schedule will be run after - in the order that they were specified.
   * </pre>
   *
   * <code>repeated string optimizers = 100;</code>
   */
  com.google.protobuf.ByteString
      getOptimizersBytes(int index);

  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  java.util.List<org.tensorflow.proto.framework.RewriterConfig.CustomGraphOptimizer> 
      getCustomOptimizersList();
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.CustomGraphOptimizer getCustomOptimizers(int index);
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  int getCustomOptimizersCount();
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  java.util.List<? extends org.tensorflow.proto.framework.RewriterConfig.CustomGraphOptimizerOrBuilder> 
      getCustomOptimizersOrBuilderList();
  /**
   * <pre>
   * list of CustomGraphOptimizers to apply.
   * </pre>
   *
   * <code>repeated .tensorflow.RewriterConfig.CustomGraphOptimizer custom_optimizers = 200;</code>
   */
  org.tensorflow.proto.framework.RewriterConfig.CustomGraphOptimizerOrBuilder getCustomOptimizersOrBuilder(
      int index);

  /**
   * <pre>
   * VerifierConfig specifying the verifiers to be run after every optimizer.
   * </pre>
   *
   * <code>.tensorflow.VerifierConfig inter_optimizer_verifier_config = 300;</code>
   */
  boolean hasInterOptimizerVerifierConfig();
  /**
   * <pre>
   * VerifierConfig specifying the verifiers to be run after every optimizer.
   * </pre>
   *
   * <code>.tensorflow.VerifierConfig inter_optimizer_verifier_config = 300;</code>
   */
  org.tensorflow.proto.framework.VerifierConfig getInterOptimizerVerifierConfig();
  /**
   * <pre>
   * VerifierConfig specifying the verifiers to be run after every optimizer.
   * </pre>
   *
   * <code>.tensorflow.VerifierConfig inter_optimizer_verifier_config = 300;</code>
   */
  org.tensorflow.proto.framework.VerifierConfigOrBuilder getInterOptimizerVerifierConfigOrBuilder();

  /**
   * <pre>
   * VerifierConfig specifying the verifiers to be run at the end, after all
   * optimizers have run.
   * </pre>
   *
   * <code>.tensorflow.VerifierConfig post_optimization_verifier_config = 301;</code>
   */
  boolean hasPostOptimizationVerifierConfig();
  /**
   * <pre>
   * VerifierConfig specifying the verifiers to be run at the end, after all
   * optimizers have run.
   * </pre>
   *
   * <code>.tensorflow.VerifierConfig post_optimization_verifier_config = 301;</code>
   */
  org.tensorflow.proto.framework.VerifierConfig getPostOptimizationVerifierConfig();
  /**
   * <pre>
   * VerifierConfig specifying the verifiers to be run at the end, after all
   * optimizers have run.
   * </pre>
   *
   * <code>.tensorflow.VerifierConfig post_optimization_verifier_config = 301;</code>
   */
  org.tensorflow.proto.framework.VerifierConfigOrBuilder getPostOptimizationVerifierConfigOrBuilder();
}
