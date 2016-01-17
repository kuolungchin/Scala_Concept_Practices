package advanced_type;
//def process[ M <: n.Member forSome {val n: Network} ](m1: M, m2: M) = (m1, m2)
//In Page 253, the type M is defined once for two parameters m1 and m2 so that m1 and m2 should belongs to the same Network.

// type NetworkMember = n.Member forSome { val n: Network }
// def process(m1: NetworkMember, m2: NetworkMember) = (m1, m2)
// NetworkMember is an alias, but it is not used as type parameter, so that m1 and m2 is independent and they can belongs to different Networks.