package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:av.class */
public class av {
    private static final char[] a = "btisfxa".toCharArray();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[] f86a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f87a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Class f88a;

    public static boolean a(int r3) {
        return r3 == 2 || r3 == 3 || r3 == 1 || r3 == 4;
    }

    public static boolean b(int r2) {
        return au.m51a(r2);
    }

    public static void a(int r3, int r4) {
        switch (r3) {
            case 1:
                if (f86a[r4] == null) {
                    m58a(m61a(1, r4));
                }
                break;
            case 2:
                au.i(r4);
                break;
            case 3:
                ay.m65a();
                break;
            case 4:
                au.g(r4);
                break;
        }
    }

    public static void b(int r4, int r5) {
        switch (r4) {
            case 1:
                f86a[r5] = null;
                break;
            case 2:
                au.j(r5);
                break;
            case 3:
                ay.b();
                break;
            case 4:
                au.h(r5);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0022 A[PHI: r6
  0x0022: PHI (r6v1 int) = (r6v0 int), (r6v4 int) binds: [B:3:0x0019, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static int a(int r4, int r5, int r6) {
        int r0 = r4 * 6;
        int r1 = f87a[r0 + r5];
        int r2 = f87a[r0 + r5 + 6];
        if (r6 == 0) {
            r6 = r1;
            if (r1 == 0) {
                r6++;
            }
        } else {
            r6++;
        }
        if (r6 >= r2) {
            return 0;
        }
        return r6;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m55a(int r3) {
        String str = f86a[r3];
        String str2 = str;
        if (str == null) {
            m58a(m61a(1, r3));
            str2 = f86a[r3];
        }
        return str2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m56a(int r5) {
        DataInputStream dataInputStream = new DataInputStream(m59a(0, r5));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int[] m57a(int r3) {
        return a(m60a(5, r3));
    }

    public static int[] a(String str) {
        Class clsM62a;
        if (f88a == null) {
            clsM62a = m62a("av");
            f88a = clsM62a;
        } else {
            clsM62a = f88a;
        }
        InputStream resourceAsStream = clsM62a.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
        try {
            int r0 = dataInputStream.readInt() >> 2;
            int[] r1 = new int[r0];
            for (int r7 = 0; r7 < r0; r7++) {
                r1[r7] = dataInputStream.readInt();
            }
            dataInputStream.close();
            return r1;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void a() {
        f86a = new String[6];
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('/');
        stringBuffer.append(a[0]);
        stringBuffer.append(1);
        f87a = a(stringBuffer.toString());
        aw.a = a(m60a(0, 2));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m58a(int r5) {
        try {
            DataInputStream dataInputStream = new DataInputStream(m59a(1, r5));
            int r0 = (r5 * 6) + 1;
            int r7 = f87a[r0];
            int r1 = f87a[r0 + 6];
            while (r7 < r1) {
                int r2 = r7;
                r7++;
                f86a[r2] = dataInputStream.readUTF();
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static InputStream m59a(int r3, int r4) {
        Class clsM62a;
        String strM60a = m60a(r3, r4);
        if (f88a == null) {
            clsM62a = m62a("av");
            f88a = clsM62a;
        } else {
            clsM62a = f88a;
        }
        return clsM62a.getResourceAsStream(strM60a);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m60a(int r4, int r5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('/');
        stringBuffer.append(a[r4]);
        stringBuffer.append(r5);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m61a(int r4, int r5) {
        int r6 = 0;
        while (r5 >= f87a[(r6 * 6) + r4 + 6]) {
            r6++;
        }
        return r6;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Class m62a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
