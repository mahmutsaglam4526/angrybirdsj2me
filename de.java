package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:de.class */
public final class de {
    public static void a(int r4, float f) {
        float fM38a = at.m38a(0.0f);
        float fM38a2 = at.m38a(ac.a);
        float fM43a = au.m43a(r4);
        float fA = fM38a - am.a(fM38a, fM43a);
        float f2 = (-au.m44b(r4)) * f;
        at.a(fA, f2);
        while (fA < fM38a2) {
            at.c(r4);
            fA += fM43a;
            at.a(fM43a, 0.0f);
        }
        at.a(-fA, -f2);
    }

    public static final int[] a(int r5, int r6) {
        int r0 = r6 - r5;
        if (r0 == 0) {
            return null;
        }
        int[] r1 = new int[r0];
        for (int r7 = 0; r7 < r1.length; r7++) {
            r1[r7] = r5 + r7;
        }
        return r1;
    }

    public static final int a(int r4) {
        int r5 = 0;
        for (int r6 = 0; r6 < r4 && r6 <= 0; r6++) {
            r5 = 0 + dj.a[0];
        }
        return r5;
    }

    public static final int b(int r4) {
        for (int r6 = 0; r6 <= 0; r6++) {
            int r0 = 0 + dj.a[0];
            if (r4 >= 0 && r4 < r0) {
                return 0;
            }
        }
        return 0;
    }
}
