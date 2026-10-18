package defpackage;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bb.class */
public final class bb implements bd, o {
    private int a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Font f99a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f100a;

    public bb(int r7, int r8, int r9) {
        this.a = r8;
        this.f99a = Font.getFont(r7 & 96, r7 & 7, r7 & 24);
        if (r9 != -1) {
            this.b = r9;
            switch (r7 & 3840) {
                case 256:
                    this.f100a = new int[]{1, 1};
                    break;
                case 512:
                    this.f100a = new int[]{-1, 0, 1, 0, 0, -1, 0, 1};
                    break;
                case 768:
                    this.f100a = new int[]{-1, -1, 1, -1, -1, 1, 1, 1};
                    break;
                case 1024:
                    this.f100a = new int[]{-1, -1, 0, -1, 1, -1, 1, 0, 1, 1, 0, 1, -1, 1, -1, 0};
                    break;
                case 1280:
                    this.f100a = new int[]{-2, -2, 0, -2, 2, -2, 2, 0, 2, 2, 0, 2, -2, 2, -2, 0};
                    break;
                case 1536:
                    this.f100a = new int[]{-1, -1, 0, -2, 1, -1, 2, 0, 1, 1, 0, 2, -1, 1, -2, 0};
                    break;
            }
        }
    }

    @Override // defpackage.o
    public final int a() {
        return this.f99a.getHeight();
    }

    @Override // defpackage.o
    public final int a(String str, int r7, int r8) {
        return str.charAt((r7 + r8) - 1) == 173 ? this.f99a.substringWidth(str, r7, r8) + this.f99a.charWidth('-') : this.f99a.charsWidth(str.toCharArray(), r7, r8);
    }

    @Override // defpackage.o
    public final void a(String str, int r11, int r12, int r13, int r14) {
        Graphics graphics = au.f76a;
        graphics.setFont(this.f99a);
        if (this.f100a != null) {
            graphics.setColor(this.b);
            int r16 = 0;
            while (r16 < this.f100a.length) {
                int r6 = r16;
                int r17 = r16 + 1;
                r16 = r17 + 1;
                b(str, r11, r12, r13 + this.f100a[r6], r14 + this.f100a[r17]);
            }
        }
        if (this.a != -1) {
            graphics.setColor(this.a);
        }
        b(str, r11, r12, r13, r14);
    }

    private void b(String str, int r10, int r11, int r12, int r13) {
        au.f76a.drawSubstring(str, r10, r11, r12, r13, 0);
        if (str.charAt((r10 + r11) - 1) == 173) {
            au.f76a.drawChar('-', r12 + this.f99a.substringWidth(str, r10, r11 - 1), r13, 0);
        }
    }
}
