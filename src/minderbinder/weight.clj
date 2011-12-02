(ns minderbinder.length
  (use [minderbinder.core :only [defunits-of]]))

(defunits-of weight ::kilogram
  "The International System of Units standard for units of mass."
  ::kg ::kilogram
  ::hg 1/10
  ::dag [1/10 ::hg]
  ::g 1/1000
  ::gram :g
  ::dg [1/10 ::g]
  ::cg [1/10 ::dg]
  ::mg [1/10 ::cg]
  ::Mg 1000
  ::Mg #{::tonne ::metric-ton}
  ::Gg [1000 ::Mg]
  ::Tg [1000 ::Gg]
  ::Pg [1000 ::Tg]
  ::Eg [1000 ::Pg]
  ::Zg [1000 ::Eg]
  ::Yg [1000 ::Zg]
  ::mcg [1/1000 ::g]
  ::ng [1/1000 ::mcg]
  ::pg [1/1000 ::ng]
  ::fg [1/1000 ::pg]
  ::ag [1/1000 ::fg]
  ::zg [1/1000 ::ag]
  ::yg [1/1000 ::yg])
  
        
  