package inheritance

/* class Stack[A] protected (protected val elems: List[A])
 * 1st protected: The constructor's protected means ONLY its subclass can use the protected constructor. (Note: even an object of Stack[A] CANNOT access it.
 * 2nd protected: The protected val elems means only its subclass can access the elems
 */
 