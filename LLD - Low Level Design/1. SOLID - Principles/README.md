### Before moving to big picture 

let understand the concept - 

as for designing you need to think of -

**How to create Object ?**

**How to Connect or Arrange them ? and ,**

**How the objects will communicate ?**

> thus we having these three Concepts -

- Creational
- Structural and ,
- Behavioral

| Category       | Think                         |
| -------------- | ----------------------------- |
| **Creational** | Object create *kaise* kare    |
| **Structural** | Objects ko jode *kaise*       |
| **Behavioral** | Objects *interact* kaise kare |

---

### Association, Aggregation, Composition

Association → Bas link 

only a relation as teacher having with student . both are independent caqn exist without dependency on each other .

Aggregation → Weak has-a

example - department has a teacher . but weak relation can exist independent.

Composition → Strong has-a

example - house has a room . if no house , no room .

---

## SOLID = code ko scalable, maintainable aur future-proof banane ke niyam

### 1️⃣ S – Single Responsibility Principle (SRP)

📌 Rule:

Ek class / component / module ka sirf ek reason hona chahiye change ka

wrong - 

```
UserService {
  saveUser();
  sendEmail();
  generatePDF();
}
```

Right -

```
UserService → user save
EmailService → email
PDFService → pdf
```

### 2️⃣ O – Open / Closed Principle (OCP)

📌 Rule:

Code extension ke liye open, modification ke liye closed

New feature = new module

### 3️⃣ L – Liskov Substitution Principle (LSP)

📌 Rule:

Child class ko parent ki jagah bina dikkat use kar sakte ho

### 4️⃣ I – Interface Segregation Principle (ISP)

📌 Rule:

Bade interface mat banao, specific interfaces banao

### 5️⃣ D – Dependency Inversion Principle (DIP)

📌 Rule:

High-level module low-level module pe depend na kare, dono abstraction pe depend karein

### 🔥 SOLID ko ek saath samajhne ka mantra

- SRP → kaam baant
- OCP → system badha, code mat tod
- LSP → contract mat tod
- ISP → chhota aur clear contract
- DIP → abstraction pe bharosa


