package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:z.class */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private j f439a = new j();
    private int a = 65536;

    public z() {
        this.f439a.a();
    }

    public final void a(y yVar, String str) {
        int length;
        int r0;
        int length2 = str.length();
        int r1 = 0;
        while (true) {
            int r10 = r1;
            if (r10 >= length2) {
                return;
            }
            int r14 = r10;
            if (str.charAt(r10) == '{') {
                int r2 = str.indexOf(125, r10 + 1);
                length = r2 < 0 ? str.length() : r2 + 1;
            } else {
                while (true) {
                    int r3 = str.indexOf(123, r14);
                    if (r3 < 0) {
                        length = str.length();
                    } else if (r3 <= 0 || str.charAt(r3 - 1) != '\\') {
                        length = r3;
                    } else {
                        r14 = r3 + 1;
                    }
                }
            }
            int r11 = length;
            if (str.charAt(r10) == '{') {
                int r15 = r10 + 1;
                char cCharAt = str.charAt(r15);
                switch (cCharAt) {
                    case 'a':
                        char cCharAt2 = str.charAt(r15 + 1);
                        if (cCharAt2 == 'v' || cCharAt2 == 'h') {
                            r15++;
                        }
                        int r4 = b(str, r15 + 1);
                        int r5 = str.indexOf(44, r15);
                        if (r5 > r15 && r5 < r11) {
                            yVar.a(r4, b(str, r5 + 1));
                        } else if (cCharAt2 != 'v') {
                            yVar.c(r4);
                        } else {
                            yVar.d(r4);
                        }
                        break;
                    case 'b':
                        yVar.d();
                        break;
                    case 'c':
                    case 'f':
                    case 'i':
                        int r16 = r15 + 1;
                        if (str.charAt(r16) == '#') {
                            int r17 = r16 + 1;
                            int r18 = r17;
                            while (str.charAt(r18) != '}') {
                                r18++;
                            }
                            String strSubstring = str.substring(r17, r18);
                            j jVar = this.f439a;
                            int r6 = ab.a(strSubstring, jVar.a.f422a, jVar.a.a);
                            r0 = r6 < 0 ? 0 : jVar.f420a.f421a[r6];
                        } else {
                            r0 = c(str, r16);
                        }
                        int r12 = r0;
                        if (cCharAt == 'f') {
                            yVar.b(r12);
                        } else if (cCharAt == 'i') {
                            yVar.a(r12);
                        }
                        break;
                    case 'n':
                        int r19 = r15 + 1;
                        if (str.charAt(r19) == '}') {
                            yVar.c();
                        } else {
                            int r7 = a(str, r19);
                            yVar.c();
                            yVar.e(r7);
                        }
                        break;
                    case 's':
                        char cCharAt3 = str.charAt(r15 + 1);
                        if (cCharAt3 == 'v' || cCharAt3 == 'h') {
                            r15++;
                        }
                        int r110 = r15 + 1;
                        if (str.charAt(r110) == '}') {
                            yVar.m202b();
                        } else {
                            int r8 = a(str, r110);
                            if (cCharAt3 != 'v') {
                                yVar.f(r8);
                            }
                        }
                        break;
                    case 'y':
                        yVar.d(b(str, r15 + 1));
                        break;
                }
            } else {
                yVar.a(str, r10, r11);
            }
            r1 = r11;
        }
    }

    private int a(String str, int r5) {
        return an.a(c(str, r5) * this.a);
    }

    private static int b(String str, int r4) {
        char cCharAt = str.charAt(r4);
        if (cCharAt >= '0' && cCharAt <= '9') {
            return (c(str, r4) << 16) / 100;
        }
        if (cCharAt == 'l' || cCharAt == 't') {
            return 0;
        }
        if (cCharAt == 'r' || cCharAt == 'b') {
            return 65536;
        }
        return cCharAt == 'c' ? 32768 : 0;
    }

    private static int c(String str, int r4) {
        int r5;
        int r0 = 0;
        while (true) {
            r5 = r0;
            int r1 = r4;
            r4++;
            char cCharAt = str.charAt(r1);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            r0 = ((r5 * 10) + cCharAt) - 48;
        }
        return r5;
    }
}
