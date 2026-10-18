package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cd.class */
public final class cd {
    private static byte[] a = new byte[15];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f149a = new int[15];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f150a;

    public static void a() {
        byte[] bArr = a;
        int length = bArr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else {
                bArr[length] = -1;
            }
        }
        ab.a(f149a, 0);
        ce.f151a = 0;
        a[0] = 0;
        f150a = 0;
        ce.a = true;
        ce.f151a = 0;
        bl blVar = new bl();
        if (ax.a(2, blVar) && blVar.a() == 6) {
            ce.a = blVar.m84a();
            ce.f151a = blVar.b();
            ce.b = blVar.m84a();
        }
        bl blVar2 = new bl();
        if (ax.a(1, blVar2) && blVar2.a() == 83 && blVar2.b() == 5) {
            for (int r5 = 0; r5 < 15; r5++) {
                a[r5] = blVar2.m83a();
                f149a[r5] = blVar2.b();
            }
            f150a = blVar2.b();
        }
    }

    public static void b() {
        bl blVar = new bl();
        blVar.b(5);
        for (int r5 = 0; r5 < 15; r5++) {
            blVar.a(a[r5]);
            blVar.b(f149a[r5]);
        }
        blVar.b(f150a);
        blVar.m82a();
        ax.b(1, blVar);
    }

    public static boolean a(int r3) {
        return r3 >= 0 && r3 < 15 && a[r3] >= 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m99a(int r3) {
        if (r3 < 0 || r3 >= 15) {
            return 0;
        }
        return a[r3];
    }

    public static int b(int r3) {
        if (r3 < 0 || r3 >= 15) {
            return 0;
        }
        return f149a[r3];
    }

    public static boolean a(int r4, int r5, int r6) {
        boolean z = false;
        if (r4 >= 0 && r4 < 15) {
            if (r5 > f149a[r4]) {
                f149a[r4] = r5;
                z = true;
            }
            if (r6 > a[r4]) {
                a[r4] = (byte) r6;
                int r0 = r4 + 1;
                if (r0 < 15 && a[r0] < 0) {
                    a[r0] = 0;
                }
                z = true;
            }
            if (z) {
                b();
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m100a(int r4) {
        de.b(r4);
        return new StringBuffer().append("").append(1).append("-").append((r4 - de.a(0)) + 1).toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m101a() {
        return f150a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m102a(int r2) {
        f150a = r2;
        dd.a(r2);
    }
}
