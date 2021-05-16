package psbp.internal.specification.naturalTransformation

private[psbp] trait ~>[-F[+ _], +T[+ _]]:

  // declared

  private[psbp] def apply[Z]: F[Z] => T[Z]