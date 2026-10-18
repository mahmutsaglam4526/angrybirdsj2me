package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dd.class */
public final class dd {
    private static int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final int[][] f254a = {new int[]{234, 236, 238}, new int[]{235, 237, 239}, new int[]{660537, 4139549, 1645839}, new int[]{9555938, 8965872, 4281135}, new int[]{240, 242, 244}, new int[]{26737, 21817, 8867840}};

    public static final void a(int r2) {
        a = r2;
    }

    public static final int a() {
        return a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final void m148a() {
        de.a(f254a[0][a], 1.0f);
    }

    public static final void b() {
        int r0 = f254a[1][a];
        de.a(r0, 0.0f);
        int r1 = f254a[4][a];
        float fM38a = at.m38a(0.0f);
        float fM38a2 = at.m38a(ac.a);
        float fM43a = 0.0f;
        for (int r9 = 0; r9 < 2; r9++) {
            fM43a += au.m43a(r1);
        }
        float fA = fM38a - am.a(fM38a, fM43a);
        float f = fA;
        at.a(fA, 0.0f);
        while (f < fM38a2) {
            for (int r6 = 0; r6 < 2; r6++) {
                int r2 = r1 + r6;
                at.a(r2, 0.0f, -au.m44b(r2));
                int r3 = au.m43a(r2);
                f += r3;
                at.a(r3, 0.0f);
            }
        }
        at.a(-f, 0.0f);
        at.a(0.0f, au.m44b(r0));
        at.e();
        at.b(f254a[2][a]);
        at.g();
        at.b(-10000.0f, 0.0f);
        at.b(10000.0f, 0.0f);
        at.b(-10000.0f, 10000.0f);
        at.b(10000.0f, 10000.0f);
        at.h();
    }

    public static final void a(ac acVar) {
        int r4;
        switch (a) {
            case 0:
                r4 = 12;
                break;
            case 1:
                r4 = 13;
                break;
            case 2:
                r4 = 14;
                break;
            default:
                a = 0;
                r4 = 12;
                break;
        }
        acVar.c(r4);
    }
}
