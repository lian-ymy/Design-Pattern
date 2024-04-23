package prototype.deepclone;

import java.io.*;

/**
 * 使用字符流完成深拷贝
 */
public class DeepClonePrototype implements Serializable,Cloneable {
    public String name;
    DeepCloneableTarget deepCloneableTarget; //引用类型

    public DeepClonePrototype() {
        super();
    }

    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            //将当前这个对象以对象流的方式输出
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            DeepClonePrototype deepClonePrototype = (DeepClonePrototype) objectInputStream.readObject();

            return deepClonePrototype;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
