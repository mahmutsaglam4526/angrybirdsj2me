package defpackage;

import java.util.Random;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:az.class */
public final class az implements ba, bd {
    public static bc a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f95a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Random f96a = new Random();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static MIDlet f97a;
    private static long b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected static long f98a;

    public static void a(MIDlet mIDlet, long j) {
        f97a = mIDlet;
        b = j;
        f98a = System.currentTimeMillis();
    }

    public static long a() {
        return System.currentTimeMillis() - f98a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m67a() {
        f95a = true;
    }

    public static void b() {
    }

    public static void c() {
    }

    public static void a(Object obj, int r7, Object obj2, int r9, int r10) {
        System.arraycopy(obj, r7, obj2, r9, r10);
    }

    public static void a(int[] r6, int r7, int[] r8, int r9, int r10) {
        System.arraycopy(r6, r7, r8, r9, r10);
    }

    public static void a(byte[] bArr, int r7, byte[] bArr2, int r9, int r10) {
        System.arraycopy(bArr, r7, bArr2, r9, r10);
    }

    public static void a(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr, 0, fArr2, 0, 6);
    }

    public static void a(int[] r4) {
        for (int r5 = 0; r5 < 4; r5++) {
            r4[r5] = 0;
        }
    }

    public static int a(int r3) {
        return (f96a.nextInt() >>> 1) % r3;
    }

    public static void d() {
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m68a() {
        bc bcVar = a;
        return 0;
    }

    public static Object a(String str) {
        if (str.equals("sys.platform")) {
            return System.getProperty("microedition.platform");
        }
        if (str.equals("sys.user_name")) {
            return System.getProperty("user.name");
        }
        if (str.equals("sys.free_mem_initial")) {
            return new Long(b);
        }
        return str.equals("com.nokia.mid.imei") ? System.getProperty("com.nokia.mid.imei") : f97a.getAppProperty(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m69a(String str) {
        try {
            f97a.platformRequest(str);
        } catch (ConnectionNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static long m70b() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        return runtime.freeMemory();
    }
}
