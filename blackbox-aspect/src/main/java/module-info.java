module blackbox.aspect {

  exports org.example.external.aspect;
  exports org.example.external.aspect.sub;

  requires io.avaje.inject;
  requires io.avaje.inject.aop;

  //remove this and compilation fails
  provides io.avaje.inject.spi.InjectExtension with org.example.external.aspect.sub.ExampleExternalAspectModule;

}
