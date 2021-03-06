USE [db_employee]
GO
/****** Object:  Table [dbo].[tb_employee]    Script Date: 12/17/2017 19:48:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_employee](
	[id] [tinyint] NOT NULL,
	[salary] [money] NULL,
	[department] [nvarchar](16) NULL,
	[dateline] [date] NULL,
	[recommend] [bigint] NULL,
	[remarks] [ntext] NULL,
	[age] [tinyint] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_employ__salar__03317E3D]    Script Date: 12/17/2017 19:48:49 ******/
ALTER TABLE [dbo].[tb_employee] ADD  DEFAULT ((5000)) FOR [salary]
GO
