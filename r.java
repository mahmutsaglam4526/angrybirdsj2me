package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:r.class */
public final class r {
    private int a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final int[] f426a;

    public r() {
    }

    public static void a(int[] r5, int r6) {
        r5[0] = an.a(r5[0], r6);
        r5[1] = an.a(r5[1], r6);
    }

    public r(int r5) {
        this.a = ac.a(r5 - 1) + 3;
        this.b = 1 << this.a;
        this.f426a = new int[this.b << 2];
    }

    public final boolean a(int r7, int[] r8) {
        int length = this.f426a.length;
        int r10 = a(r7);
        while (this.f426a[r10] != r7) {
            if (this.f426a[r10] == 0) {
                return false;
            }
            int r0 = r10 + 4;
            r10 = r0;
            if (r0 >= length) {
                r10 = 0;
            }
        }
        az.a(this.f426a, r10 + 1, r8, 0, 3);
        return true;
    }

    public final int a(int r6) {
        return (((r6 << 2) + ((r6 & 3) << (this.a - 2))) & ((1 << this.a) - 1)) << 2;
    }
}
