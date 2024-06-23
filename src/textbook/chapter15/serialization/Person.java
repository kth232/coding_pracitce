package textbook.chapter15.serialization;

import java.io.*;

public class Person implements Serializable, Externalizable { //직렬화하겠다는 의미의 마커 인터페이스 구현
    private static final long serialVersionUID = -1503252402544036183L; //직렬화 버전 정보

    String name;
    transient String job; //transient: 직렬화, 역직렬화 과정에서 배제됨


    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString()
    {
        return "name: " + name + ", job: " + job;
    }

    //Externalizable 인터페이스 메서드 구현
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        job = in.readUTF();
    }
}
