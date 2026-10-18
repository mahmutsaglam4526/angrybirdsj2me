package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:as.class */
public final class as {
    private static t a = new t();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f66a = new int[4];
    private static int[] b = {50, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f67a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int f68b;
    private static int c;
    private static int d;
    private static int e;

    public static synchronized void a(int r7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f66a[0] = r7;
        f66a[3] = (int) (jCurrentTimeMillis - az.f98a);
        a.a(f66a);
    }

    public static synchronized void a(int r7, int r8, int r9) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        f66a[0] = r7;
        f66a[1] = r8;
        f66a[2] = r9;
        f66a[3] = (int) (jCurrentTimeMillis - az.f98a);
        a.a(f66a);
        if (r7 == 48) {
            b[1] = f66a[1];
            b[2] = f66a[2];
            System.currentTimeMillis();
        }
    }

    public static synchronized void b(int r7, int r8, int r9) {
        int r0 = q.d(r8 - au.c, au.f78a);
        int r1 = q.d(r9 - au.d, au.f79b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        f66a[0] = r7;
        f66a[1] = r0;
        f66a[2] = r1;
        f66a[3] = (int) (jCurrentTimeMillis - az.f98a);
        a.a(f66a);
    }

    public static void a() {
    }

    private static int a(int r7, boolean z) {
        if (z) {
            t tVar = a;
            int[] r1 = f66a;
            int r0 = (tVar.a + r7) % tVar.d;
            az.a(tVar.f427a, r0 * tVar.c, r1, 0, tVar.c);
            if (r0 < tVar.b) {
                az.a(tVar.f427a, ((r0 + 1) % tVar.d) * tVar.c, tVar.f427a, r0 * tVar.c, (tVar.b - r0) * tVar.c);
                tVar.b = (tVar.b - 1) % tVar.d;
            } else {
                az.a(tVar.f427a, tVar.a * tVar.c, tVar.f427a, (tVar.a + 1) * tVar.c, (r0 - tVar.a) * tVar.c);
                tVar.a = (tVar.a + 1) % tVar.d;
            }
        } else {
            a.a(f66a, r7);
        }
        f67a = f66a[0];
        int[] r2 = f66a;
        switch (f67a & 240) {
            case 48:
                f68b = f66a[2];
                c = f66a[1];
                break;
            case 64:
                d = f66a[1];
                e = f66a[2];
                break;
        }
        return f67a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized int m36a() {
        if (a.a() > 0) {
            return a(0, false);
        }
        return 0;
    }

    public static synchronized int b() {
        int r0 = a.a();
        for (int r5 = 0; r5 < r0; r5++) {
            a.a(f66a, r5);
            if ((f66a[0] & 240) == 16) {
                return a(r5, false);
            }
        }
        return 0;
    }

    public static synchronized int c() {
        if (a.a() > 0) {
            return a(0, true);
        }
        return 0;
    }

    public static int d() {
        return f68b;
    }

    public static int e() {
        return c;
    }

    public static int f() {
        return d;
    }

    public static int g() {
        return e;
    }
}
