package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:n.class */
public final class n implements o {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public r f423a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int[] f424a = new int[3];

    @Override // defpackage.o
    public final int a() {
        return this.g;
    }

    @Override // defpackage.o
    public final int a(String str, int r6, int r7) {
        if (r7 <= 0) {
            return 0;
        }
        int r8 = 0;
        for (int r9 = 0; r9 < r7; r9++) {
            char cCharAt = str.charAt(r6 + r9);
            char c = cCharAt;
            if (cCharAt == 173 && r9 == r7 - 1) {
                c = 173;
            } else if (c == 160) {
                c = ' ';
            }
            if (this.f423a.a(c + 1, this.f424a)) {
                r8 += this.f424a[0] + this.h;
            }
        }
        return r8;
    }

    @Override // defpackage.o
    public final void a(String str, int r11, int r12, int r13, int r14) {
        int r0 = r14 - this.e;
        int r15 = r13 - this.c;
        int r1 = r11 + r12;
        while (r11 < r1) {
            char cCharAt = str.charAt(r11);
            char c = cCharAt;
            if (cCharAt == 173 && r11 == r1 - 1) {
                c = 173;
            } else if (c == 160) {
                c = ' ';
            }
            if (this.f423a.a(c + 1, this.f424a)) {
                int r2 = this.f424a[0];
                int r3 = this.f424a[1];
                int r4 = this.f424a[2];
                if (au.m40a() == 2) {
                    at.a(this.a, r15, r0, r3, r4, r2, this.b);
                } else {
                    au.a(this.a, r3, r4, r2, this.b, 0, r15, r0);
                }
                r15 += r2 + this.h;
            }
            r11++;
        }
    }
}
