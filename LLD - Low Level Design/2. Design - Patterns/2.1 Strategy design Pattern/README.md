# Strategy design pattern

Strategy Design Pattern ek behavioral design pattern hai jo hume runtime par 
algorithm / behavior ko change karne ki flexibility deta hai without client code ko modify kiye.

> “Kaam ek hi hai, tareeke alag-alag.”

Jaise:

- Payment karna hai → UPI / Card / NetBanking

- Sorting karni hai → QuickSort / MergeSort / BubbleSort

- Tax calculate karna hai → Old Regime / New Regime

---

### 🧩 Problem Statement (Why we need Strategy?)

Agar hum if-else ya switch-case se har behavior handle karein:

Code tight coupled ho jaata hai

New behavior add karne par existing code modify karna padta hai

OCP (Open–Closed Principle) violate hota hai

👉 Production systems + Government software me yeh approach risky hoti hai.


### 💡 Solution (Strategy Pattern)

Strategy Pattern kehta hai:

Ek common interface banao

Har behavior ka alag concrete class banao

Runtime par decide karo kaunsa strategy use karni hai

Isse:

Code loosely coupled hota hai

Naya behavior add karna easy & safe hota hai

Testing aur maintenance simple hoti hai

---

