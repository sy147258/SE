package se.exp3.a1;

/**
 * A1-1 Thoroughbred 类模型
 * 关系：mother / father 为自关联（1..1 可选）
 */
public class Thoroughbred {
    private Thoroughbred mother;   // - mother : Thoroughbred
    private Thoroughbred father;   // - father : Thoroughbred
    private int birthyear;         // - birthyear : integer

    public Thoroughbred() {}

    public Thoroughbred(Thoroughbred mother, Thoroughbred father, int birthyear) {
        this.mother = mother;
        this.father = father;
        this.birthyear = birthyear;
    }

    /** + getCurrentAge() : integer */
    public int getCurrentAge() {
        return java.time.Year.now().getValue() - birthyear;
    }

    /** + getFather() : Thoroughbred */
    public Thoroughbred getFather() { return father; }

    /** + getMother() : Thoroughbred */
    public Thoroughbred getMother() { return mother; }

    public void setMother(Thoroughbred mother) { this.mother = mother; }
    public void setFather(Thoroughbred father) { this.father = father; }
    public void setBirthyear(int birthyear) { this.birthyear = birthyear; }
    public int getBirthyear() { return birthyear; }
}
