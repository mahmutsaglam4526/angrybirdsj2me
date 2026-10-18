package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:l.class */
public final class l {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int[] f421a;

    public l() {
        this.f421a = new int[4];
    }

    public l(int r4) {
        this.f421a = new int[r4];
    }

    public final int a() {
        return this.f421a[this.a - 1];
    }

    public final void a(int r5) {
        this.f421a[m193a(this.a, 1)] = r5;
    }

    public final void a(int r5, int r6) {
        m193a(r5, 1);
        this.f421a[r5] = r6;
    }

    public final int b() {
        int r0 = this.f421a[this.a - 1];
        m193a(this.a - 1, -1);
        return r0;
    }

    public final int c() {
        int r0 = this.f421a[0];
        m193a(0, -1);
        return r0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private int m193a(int r9, int r10) {
        int r1;
        int[] r2 = this.f421a;
        int r3 = this.a;
        int r13 = r9;
        int[] r11 = r2;
        if (r10 >= 0) {
            int length = r11.length;
            int r14 = length;
            if (length < r3 + r10) {
                do {
                    r1 = r14 << 1;
                    r14 = r1;
                } while (r1 < r3 + r10);
                int[] r4 = new int[r14];
                az.a(r11, 0, r4, 0, r3);
                r11 = r4;
            }
        } else {
            r13 = r9 - r10;
        }
        if (r13 < r3) {
            az.a(r11, r13, r11, r13 + r10, r3 - r13);
        }
        this.f421a = r11;
        this.a += r10;
        if (r10 > 0) {
            ab.a(this.f421a, r9, r10, 0);
        }
        return r9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a != lVar.a) {
            return false;
        }
        int r7 = this.a;
        do {
            int r0 = r7;
            r7--;
            if (r0 <= 0) {
                return true;
            }
        } while (this.f421a[r7] == lVar.f421a[r7]);
        return false;
    }

    public final String toString() {
        return super.toString();
    }
}
