package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:by.class */
public final class by extends bx {
    private int d = 0;

    @Override // defpackage.bo
    public final void a(bo boVar) {
        a(boVar, 32768, 32768, 0, 0);
    }

    public final void a(bo boVar, int r9, int r10) {
        a(boVar, r9, r10, 0, 0);
    }

    public final void a(bo boVar, int r11, int r12, int r13, int r14) {
        a(boVar, r11, r12, r11, r12, r13, r14);
    }

    public final void a(bo boVar, int r6, int r7, int r8, int r9, int r10, int r11) {
        int[] r0 = a();
        r0[2] = r6;
        r0[3] = r7;
        r0[4] = r8;
        r0[5] = r9;
        r0[0] = r10;
        r0[1] = r11;
        super.a(boVar);
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: b */
    public final void mo89b() {
        super.mo89b();
    }

    @Override // defpackage.bo
    public final void a(int r10, int r11) {
        ((bo) this).b[2] = r10;
        ((bo) this).b[3] = r11;
        int r12 = 0;
        while (true) {
            bo boVarA = a(r12);
            if (boVarA == null) {
                break;
            }
            boVarA.mo89b();
            if (boVarA.mo88a() > this.d) {
                this.d = boVarA.mo88a();
            }
            r12++;
        }
        int r13 = 0;
        while (true) {
            bo boVarA2 = a(r13);
            if (boVarA2 == null) {
                return;
            }
            int[] r0 = a(r13);
            if (r0[6] > 0 || r0[7] > 0) {
                boVarA2.a((r0[6] > 0 ? ((bo) this).b : boVarA2.b)[2], (r0[7] > 0 ? ((bo) this).b : boVarA2.b)[3]);
            }
            for (int r14 = 0; r14 < 2; r14++) {
                boVarA2.b[r14] = (((((bo) this).b[r14 + 2] * r0[r14 + 2]) - (boVarA2.b[r14 + 2] * r0[r14 + 4])) >> 16) + r0[r14];
            }
            r13++;
        }
    }

    @Override // defpackage.bm, defpackage.bo
    /* JADX INFO: renamed from: a */
    public final int mo88a() {
        return this.d;
    }
}
